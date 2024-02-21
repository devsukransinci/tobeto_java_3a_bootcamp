package com.tobeto.javaBootcamp.webApi.controllers;

import com.tobeto.javaBootcamp.business.abstracts.EmployeeService;
import com.tobeto.javaBootcamp.business.abstracts.InstructorService;
import com.tobeto.javaBootcamp.business.requests.create.employee.CreateEmployeeRequest;
import com.tobeto.javaBootcamp.business.requests.create.instructor.CreateInstructorRequest;
import com.tobeto.javaBootcamp.business.response.create.Intructor.CreateInstructorResponse;
import com.tobeto.javaBootcamp.business.response.create.employee.CreateEmployeeResponse;
import com.tobeto.javaBootcamp.business.response.get.Intructor.GetAllInstructorResponse;
import com.tobeto.javaBootcamp.business.response.get.Intructor.GetInstructorResponse;
import com.tobeto.javaBootcamp.business.response.get.employee.GetAllEmployeeResponse;
import com.tobeto.javaBootcamp.business.response.get.employee.GetEmployeeResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
@AllArgsConstructor
public class EmployeeController {
     private EmployeeService employeeService;

    @PostMapping()
    public CreateEmployeeResponse add(@RequestBody CreateEmployeeRequest request){
        CreateEmployeeResponse result =employeeService.add(request);
        return  result;

    }
    @GetMapping("getallemployee")
    public List<GetAllEmployeeResponse> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @GetMapping("getbyPosition/{position}")
    public GetEmployeeResponse  getByPosition(@PathVariable String position){
        return employeeService.getByPosition(position);
    }


}
