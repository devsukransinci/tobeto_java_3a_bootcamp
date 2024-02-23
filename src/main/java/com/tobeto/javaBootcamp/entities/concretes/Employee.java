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
@Table(name = "employees")
@EqualsAndHashCode(callSuper = true)
@Inheritance(strategy = InheritanceType.JOINED)
public class Employee extends User  {

    @Column(name = "position")

    private String position;

    @ManyToOne
    @JoinColumn(name = "bootcampId")
    private Bootcamp bootcamp;
}
