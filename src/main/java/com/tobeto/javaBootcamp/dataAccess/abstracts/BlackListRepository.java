package com.tobeto.javaBootcamp.dataAccess.abstracts;

import com.tobeto.javaBootcamp.entities.concretes.ApplicationState;
import com.tobeto.javaBootcamp.entities.concretes.BlackList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlackListRepository extends JpaRepository<BlackList,Integer> {
    BlackList getById(int id);
    BlackList getByApplicantId(int applicant_id);
    BlackList  getByDate (String date);
}
