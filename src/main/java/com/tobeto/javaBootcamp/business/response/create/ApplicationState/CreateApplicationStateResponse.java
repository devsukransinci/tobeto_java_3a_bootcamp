package com.tobeto.javaBootcamp.business.response.create.ApplicationState;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class CreateApplicationStateResponse {
    private int id;
    private  String name;
}
