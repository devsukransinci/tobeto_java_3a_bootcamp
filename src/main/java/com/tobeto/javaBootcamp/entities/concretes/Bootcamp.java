package com.tobeto.javaBootcamp.entities.concretes;

import com.tobeto.javaBootcamp.core.entities.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "bootcamps")
@Inheritance(strategy = InheritanceType.JOINED)

public class Bootcamp extends BaseEntity<Integer> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "instructorId")
    private Instructor instructor;

    @ManyToOne
    @JoinColumn(name = "bootcampStateId")
    private BootcampState bootcampState;

    @Column(name = "name")
    private String name;

    @Column(name = "startDate")
   private  String startDate;
    @Column(name = "endDate")
   private String endDate;

    @OneToMany(mappedBy = "bootcamp")
    private List<Application> applications;
}
