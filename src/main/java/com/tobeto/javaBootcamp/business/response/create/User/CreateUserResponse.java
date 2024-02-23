package com.tobeto.javaBootcamp.business.response.create.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserResponse {
    private int id;
    private String userName;
}

