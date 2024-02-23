package com.tobeto.javaBootcamp.webApi.controllers;

import com.tobeto.javaBootcamp.business.abstracts.ApplicationService;
import com.tobeto.javaBootcamp.business.requests.create.application.CreateApplicationRequest;
import com.tobeto.javaBootcamp.business.response.create.Application.CreateApplicationResponse;
import com.tobeto.javaBootcamp.business.response.get.Applicant.GetApplicantResponse;
import com.tobeto.javaBootcamp.business.response.get.Application.GetAllApplicationResponse;
import com.tobeto.javaBootcamp.business.response.get.Application.GetApplicationResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/application")
@AllArgsConstructor
public class ApplicationController {
    private ApplicationService applicationService;

    @PostMapping()
    public CreateApplicationResponse add(@RequestBody CreateApplicationRequest request) {
        CreateApplicationResponse result = applicationService.add(request);
        return result;

    }

    @GetMapping("getall")
    public List<GetAllApplicationResponse> getAll() {
        return applicationService.getAllApplication();
    }

    @GetMapping("getbyId/{id}")
    public GetApplicationResponse getById(@PathVariable int id) {
        return applicationService.getById(id);
    }
}

