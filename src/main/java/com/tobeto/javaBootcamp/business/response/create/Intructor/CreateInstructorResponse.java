package com.tobeto.javaBootcamp.business.response.create.Intructor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
 @AllArgsConstructor
 @NoArgsConstructor

public class CreateInstructorResponse {
    private  int id;
    private String companyName;
    private LocalDateTime createdDate;
}
