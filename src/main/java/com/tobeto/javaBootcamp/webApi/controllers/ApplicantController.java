package com.tobeto.javaBootcamp.webApi.controllers;

import com.tobeto.javaBootcamp.business.abstracts.ApplicantService;
import com.tobeto.javaBootcamp.business.requests.create.applicant.CreateApplicantRequest;
import com.tobeto.javaBootcamp.business.response.create.Applicant.CreateApplicantResponse;
import com.tobeto.javaBootcamp.business.response.get.Applicant.GetAllApplicantResponse;
import com.tobeto.javaBootcamp.business.response.get.Applicant.GetApplicantResponse;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/applicants")
@AllArgsConstructor
public class ApplicantController {
    private ApplicantService applicantService;

    @Autowired
    private ApplicantService  upplicantService;

    @PostMapping()
    public CreateApplicantResponse add(@RequestBody CreateApplicantRequest  request){
        CreateApplicantResponse  result =applicantService.add(request);
        return  result;
    }
    @GetMapping("getallapplicants")
    public List<GetAllApplicantResponse> getAllApplicant(){
        return applicantService.getAllApplicant();
    }

    @GetMapping("getByAbout/{about}")
    public GetApplicantResponse  getByAbout(@PathVariable String about){
        return applicantService.getByAbout(about);
    }




}
