package com.tobeto.javaBootcamp.entities.concretes;

import com.tobeto.javaBootcamp.core.entities.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "applications")
@EqualsAndHashCode
@Inheritance(strategy = InheritanceType.JOINED)
public class Application extends BaseEntity<Integer> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    @ManyToOne
    @JoinColumn(name = "applicantId")
    private Applicant applicant;
    @ManyToOne
    @JoinColumn(name = "applicationStateId")
    private ApplicationState applicationState;
    @ManyToOne
    @JoinColumn(name = "bootcampId")
    private Bootcamp bootcamp;

    @ManyToOne
    @JoinColumn(name = "bootcampStateId")
    private BootcampState bootcampState;


}
