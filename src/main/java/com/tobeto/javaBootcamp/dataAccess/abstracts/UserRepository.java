package com.tobeto.javaBootcamp.dataAccess.abstracts;

import com.tobeto.javaBootcamp.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    User getById(int id);


}
