package com.tobeto.javaBootcamp.business.abstracts;

import com.tobeto.javaBootcamp.business.requests.create.user.CreateUserRequest;
import com.tobeto.javaBootcamp.business.response.create.user.CreateUserResponse;
import com.tobeto.javaBootcamp.business.response.get.user.GetAllUserResponse;
import com.tobeto.javaBootcamp.business.response.get.user.GetUserResponse;


import java.util.List;

public interface UserService {
    CreateUserResponse add(CreateUserRequest request);
    List<GetAllUserResponse> getAll();
     GetUserResponse getById(int id);
    boolean deleteUser(int userId);

}
