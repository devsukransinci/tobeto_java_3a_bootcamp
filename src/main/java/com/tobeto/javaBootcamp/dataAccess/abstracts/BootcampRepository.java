package com.tobeto.javaBootcamp.dataAccess.abstracts;

import com.tobeto.javaBootcamp.entities.concretes.Application;
import com.tobeto.javaBootcamp.entities.concretes.Bootcamp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BootcampRepository extends JpaRepository<Bootcamp,Integer> {
    Bootcamp  getByName(String name);
    Bootcamp  getById(int id);
}
