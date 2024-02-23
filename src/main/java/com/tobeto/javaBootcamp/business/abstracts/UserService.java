package com.tobeto.javaBootcamp.business.abstracts;
import com.tobeto.javaBootcamp.business.requests.create.user.CreateUserRequest;
import com.tobeto.javaBootcamp.business.response.create.User.CreateUserResponse;
import com.tobeto.javaBootcamp.business.response.get.user.GetAllUserResponse;
import com.tobeto.javaBootcamp.business.response.get.user.GetUserResponse;
import com.tobeto.javaBootcamp.core.utilities.results.DataResult;
import java.util.List;

public interface UserService {
    DataResult <CreateUserResponse> add(CreateUserRequest request);
   DataResult <List<GetAllUserResponse>> getAll();
     GetUserResponse getById(int id);
    boolean deleteUser(int userId);

}
