package com.tobeto.javaBootcamp.business.response.get.Bootcamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetBootcampResponse {
    private int id;
    private String name;
    private  String startDate;
    private String endDate;
}
