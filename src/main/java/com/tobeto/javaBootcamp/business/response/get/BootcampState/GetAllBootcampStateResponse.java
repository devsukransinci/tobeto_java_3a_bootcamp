package com.tobeto.javaBootcamp.business.response.get.BootcampState;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllBootcampStateResponse {
    private int id;
    private String name;
}
