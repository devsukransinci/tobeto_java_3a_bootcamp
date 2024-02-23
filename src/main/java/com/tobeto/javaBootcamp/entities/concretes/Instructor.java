package com.tobeto.javaBootcamp.entities.concretes;

import com.tobeto.javaBootcamp.core.entities.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "instructors")
@EqualsAndHashCode(callSuper = true)
@Inheritance(strategy = InheritanceType.JOINED)

public class Instructor extends User {
    @Column(name = "companyName")
    private String companyName;

    @Column(name = "instructorId")
    private int instructorId;

@ManyToOne
@JoinColumn (name = "userId")
private User user;


}
