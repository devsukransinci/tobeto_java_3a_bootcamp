package com.tobeto.javaBootcamp.business.concretes;

import com.tobeto.javaBootcamp.business.abstracts.EmployeeService;
import com.tobeto.javaBootcamp.business.requests.create.employee.CreateEmployeeRequest;

import com.tobeto.javaBootcamp.business.response.create.employee.CreateEmployeeResponse;

import com.tobeto.javaBootcamp.business.response.get.Intructor.GetInstructorResponse;
import com.tobeto.javaBootcamp.business.response.get.employee.GetAllEmployeeResponse;
import com.tobeto.javaBootcamp.business.response.get.employee.GetEmployeeResponse;
import com.tobeto.javaBootcamp.core.utilities.mapping.ModelMapperService;
import com.tobeto.javaBootcamp.dataAccess.abstracts.EmployeeRepository;
import com.tobeto.javaBootcamp.entities.concretes.Employee;
import com.tobeto.javaBootcamp.entities.concretes.Instructor;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;
@Service
@AllArgsConstructor

public class EmployeeManager implements EmployeeService {
    private EmployeeRepository employeeRepository;
    private ModelMapperService mapperService;

    @Override
    public CreateEmployeeResponse add(CreateEmployeeRequest request) {
        Employee employee =mapperService.forRequest().map(request,Employee.class);
        employee.setPosition(request.getPosition());
        employeeRepository.save(employee);
        CreateEmployeeResponse response =mapperService.forResponse().map(employee, CreateEmployeeResponse.class);
        return response;
    }

    @Override
    public List<GetAllEmployeeResponse> getAllEmployee() {
        List<Employee> employees =employeeRepository.findAll();
        List<GetAllEmployeeResponse> employeeResponses =employees.stream().map(employee -> mapperService.forResponse().map(employee, GetAllEmployeeResponse.class))
                .collect(Collectors.toList());
        return employeeResponses;
    }



    @Override
    public GetEmployeeResponse getByPosition(String position) {
        Employee employee =employeeRepository.getByPosition(position);
        GetEmployeeResponse response =
                mapperService.forResponse().map(employee,GetEmployeeResponse.class);
        return response;
    }
}
