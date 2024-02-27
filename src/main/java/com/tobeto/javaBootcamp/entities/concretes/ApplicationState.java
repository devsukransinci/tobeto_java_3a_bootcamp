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
@Table(name = "applicationsStates")
@EqualsAndHashCode
public class ApplicationState extends BaseEntity<Integer> {

    @Column(name = "name")
    private  String name;

    @OneToMany(mappedBy = "applicationState")
    private List<Application> applications;

}
