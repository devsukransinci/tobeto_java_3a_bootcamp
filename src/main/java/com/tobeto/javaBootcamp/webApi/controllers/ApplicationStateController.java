package com.tobeto.javaBootcamp.webApi.controllers;

import com.tobeto.javaBootcamp.business.abstracts.ApplicationService;
import com.tobeto.javaBootcamp.business.abstracts.ApplicationStateService;
import com.tobeto.javaBootcamp.business.abstracts.UserService;
import com.tobeto.javaBootcamp.business.requests.create.application.CreateApplicationRequest;
import com.tobeto.javaBootcamp.business.requests.create.applicationState.CreateApplicationStateRequest;
import com.tobeto.javaBootcamp.business.requests.create.user.CreateUserRequest;
import com.tobeto.javaBootcamp.business.response.create.Application.CreateApplicationResponse;
import com.tobeto.javaBootcamp.business.response.create.ApplicationState.CreateApplicationStateResponse;
import com.tobeto.javaBootcamp.business.response.create.User.CreateUserResponse;
import com.tobeto.javaBootcamp.business.response.get.Application.GetAllApplicationResponse;
import com.tobeto.javaBootcamp.business.response.get.Application.GetApplicationResponse;
import com.tobeto.javaBootcamp.business.response.get.ApplicationState.GetAllApplicationStateResponse;
import com.tobeto.javaBootcamp.business.response.get.ApplicationState.GetApplicationStateResponse;
import com.tobeto.javaBootcamp.business.response.get.user.GetAllUserResponse;
import com.tobeto.javaBootcamp.business.response.get.user.GetUserResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/applicationState")
@AllArgsConstructor
public class ApplicationStateController {
    private ApplicationStateService applicationStateService;

    @PostMapping()
    public CreateApplicationStateResponse add(@RequestBody CreateApplicationStateRequest request) {
        CreateApplicationStateResponse result = applicationStateService.add(request);
        return result;

    }

    @GetMapping("getall")
    public List<GetAllApplicationStateResponse> getAll() {
        return applicationStateService.getAllApplicationState();
    }

    @GetMapping("getbyId/{id}")
    public GetApplicationStateResponse getById(@PathVariable int id) {
        return applicationStateService.getById(id);
    }
}
