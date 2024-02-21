package com.tobeto.javaBootcamp.dataAccess.abstracts;

import com.tobeto.javaBootcamp.entities.concretes.Applicant;
import com.tobeto.javaBootcamp.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicantRepository extends JpaRepository<Applicant,Integer> {

    Applicant  getByAbout (String about);


}
