package com.tobeto.javaBootcamp.webApi.controllers;
import com.tobeto.javaBootcamp.business.abstracts.UserService;
import com.tobeto.javaBootcamp.business.requests.create.user.CreateUserRequest;
import com.tobeto.javaBootcamp.business.response.create.user.CreateUserResponse;
import com.tobeto.javaBootcamp.business.response.get.user.GetAllUserResponse;
import com.tobeto.javaBootcamp.business.response.get.user.GetUserResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor

public class UserController {
    private  UserService userService;
    @PostMapping()
  public CreateUserResponse add(@RequestBody CreateUserRequest request){
        CreateUserResponse result =userService.add(request);
   return  result;

}
@GetMapping("getall")
public List <GetAllUserResponse> getAll(){
        return userService.getAll();
}

@GetMapping("getbyId/{id}")
public GetUserResponse getById(@PathVariable int id){
        return userService.getById(id);
}

}

