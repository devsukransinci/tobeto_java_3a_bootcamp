package com.tobeto.javaBootcamp.business.response.get.Application;

import com.tobeto.javaBootcamp.entities.concretes.Applicant;
import com.tobeto.javaBootcamp.entities.concretes.Bootcamp;
import com.tobeto.javaBootcamp.entities.concretes.BootcampState;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllApplicationResponse {
    private  int id;
    private int applicantId;
    private int bootcampId;
    private int bootcampStateId;

}
