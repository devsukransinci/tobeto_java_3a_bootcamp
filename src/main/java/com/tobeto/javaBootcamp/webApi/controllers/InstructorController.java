package com.tobeto.javaBootcamp.webApi.controllers;

import com.tobeto.javaBootcamp.business.abstracts.InstructorService;
import com.tobeto.javaBootcamp.business.abstracts.UserService;
import com.tobeto.javaBootcamp.business.requests.create.instructor.CreateInstructorRequest;
import com.tobeto.javaBootcamp.business.requests.create.user.CreateUserRequest;
import com.tobeto.javaBootcamp.business.response.create.Intructor.CreateInstructorResponse;
import com.tobeto.javaBootcamp.business.response.create.user.CreateUserResponse;
import com.tobeto.javaBootcamp.business.response.get.Intructor.GetAllInstructorResponse;
import com.tobeto.javaBootcamp.business.response.get.Intructor.GetInstructorResponse;
import com.tobeto.javaBootcamp.business.response.get.user.GetAllUserResponse;
import com.tobeto.javaBootcamp.business.response.get.user.GetUserResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/instructors")
@AllArgsConstructor
public class InstructorController {

    private InstructorService  instructorService;
    @PostMapping()
    public CreateInstructorResponse addinstructor(@RequestBody CreateInstructorRequest request){
        CreateInstructorResponse result =instructorService.add(request);
        return  result;

    }
    @GetMapping("getallinstructor")
    public List<GetAllInstructorResponse> getAllInstructor(){
        return instructorService.getAllInstructor();
    }

    @GetMapping("getbyCompanyName/{companyName}")
    public GetInstructorResponse getByCompanyName(@PathVariable String companyName){
        return instructorService.getByCompanyName(companyName);
    }




}
