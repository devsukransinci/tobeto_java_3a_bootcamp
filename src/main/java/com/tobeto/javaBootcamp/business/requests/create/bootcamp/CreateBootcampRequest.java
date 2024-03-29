package com.tobeto.javaBootcamp.business.requests.create.bootcamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateBootcampRequest {
    private int id;
    private int instructorId;
    private String name;
    private  String startDate;
    private String endDate;
    private int bootcampStateId;
}
