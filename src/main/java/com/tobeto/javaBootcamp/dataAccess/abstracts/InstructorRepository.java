package com.tobeto.javaBootcamp.dataAccess.abstracts;

import com.tobeto.javaBootcamp.entities.concretes.Instructor;
import com.tobeto.javaBootcamp.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepository extends JpaRepository<Instructor,Integer> {
    Instructor  getByCompanyName(String companyName);

}
