package com.tobeto.javaBootcamp.entities.concretes;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "applicants")
@EqualsAndHashCode(callSuper = true)
@PrimaryKeyJoinColumn(name = "userId")
public class Applicant extends User{

    @Column(name = "about")
    private String about;
    @OneToOne(mappedBy = "applicant", cascade = CascadeType.ALL)
    private BlackList blackList;

}

