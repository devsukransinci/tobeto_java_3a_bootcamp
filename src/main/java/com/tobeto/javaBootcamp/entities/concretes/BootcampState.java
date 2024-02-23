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
@Table(name = "bootcampStates")
@EqualsAndHashCode
@Inheritance(strategy = InheritanceType.JOINED)
public class BootcampState extends BaseEntity<Integer> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "bootcampState")
    private List<Bootcamp> bootcamps;
}
