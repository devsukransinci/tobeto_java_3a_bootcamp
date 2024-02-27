package com.tobeto.javaBootcamp.business.requests.create.application;

import com.tobeto.javaBootcamp.entities.concretes.ApplicationState;
import com.tobeto.javaBootcamp.entities.concretes.Bootcamp;
import com.tobeto.javaBootcamp.entities.concretes.User;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateApplicationRequest {
    private  int id;
    private int applicantId;
    private int applicationStateId;
    private int bootcampId;


}
