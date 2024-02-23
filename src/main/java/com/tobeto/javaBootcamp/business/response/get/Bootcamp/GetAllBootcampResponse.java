package com.tobeto.javaBootcamp.business.response.get.Bootcamp;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllBootcampResponse {

    private int id;
    private int instructorId;
    private int bootcampStateId;
    private String name;
    private  String startDate;
    private String endDate;
}
