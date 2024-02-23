package com.tobeto.javaBootcamp.business.requests.create.applicationState;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateApplicationStateRequest {
    private int id;
    private  String name;
}
