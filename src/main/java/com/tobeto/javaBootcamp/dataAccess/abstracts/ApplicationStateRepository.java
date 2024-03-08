package com.tobeto.javaBootcamp.dataAccess.abstracts;

import com.tobeto.javaBootcamp.entities.concretes.Application;
import com.tobeto.javaBootcamp.entities.concretes.ApplicationState;
import org.springframework.data.jpa.repository.JpaRepository;
//getDateEklenecek
public interface ApplicationStateRepository extends JpaRepository<ApplicationState,Integer> {
    ApplicationState  getByName(String name);
    ApplicationState  getById(int id);
}
