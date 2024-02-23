package com.tobeto.javaBootcamp.business.response.create.Bootcamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateBootcampResponse {
    private int id;
    private String name;
    private  String startDate;
    private String endDate;
}
