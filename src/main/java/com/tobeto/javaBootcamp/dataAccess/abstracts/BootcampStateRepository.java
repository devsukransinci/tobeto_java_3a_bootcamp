package com.tobeto.javaBootcamp.dataAccess.abstracts;

import com.tobeto.javaBootcamp.entities.concretes.Application;
import com.tobeto.javaBootcamp.entities.concretes.BootcampState;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BootcampStateRepository extends JpaRepository<BootcampState,Integer> {

    BootcampState  getById(int id);
}
