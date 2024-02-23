package com.tobeto.javaBootcamp.webApi.controllers;

import com.tobeto.javaBootcamp.business.abstracts.BootcampService;
import com.tobeto.javaBootcamp.business.abstracts.UserService;
import com.tobeto.javaBootcamp.business.requests.create.bootcamp.CreateBootcampRequest;
import com.tobeto.javaBootcamp.business.requests.create.user.CreateUserRequest;
import com.tobeto.javaBootcamp.business.response.create.Bootcamp.CreateBootcampResponse;
import com.tobeto.javaBootcamp.business.response.create.User.CreateUserResponse;
import com.tobeto.javaBootcamp.business.response.get.Bootcamp.GetAllBootcampResponse;
import com.tobeto.javaBootcamp.business.response.get.Bootcamp.GetBootcampResponse;
import com.tobeto.javaBootcamp.business.response.get.user.GetAllUserResponse;
import com.tobeto.javaBootcamp.business.response.get.user.GetUserResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/bootcamp")
@AllArgsConstructor
public class BootcampController {
    private BootcampService bootcampService;
    @PostMapping()
    public CreateBootcampResponse add(@RequestBody CreateBootcampRequest request){
        CreateBootcampResponse result =bootcampService.add(request);
        return  result;

    }
    @GetMapping("getall")
    public List<GetAllBootcampResponse> getAll(){
        return bootcampService.getAllBootcamp();
    }

    @GetMapping("getbyId/{id}")
    public GetBootcampResponse getById(@PathVariable int id){
        return bootcampService.getById(id);
    }
}
