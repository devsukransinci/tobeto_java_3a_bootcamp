package com.tobeto.javaBootcamp.business.abstracts;

import com.tobeto.javaBootcamp.business.requests.create.employee.CreateEmployeeRequest;
import com.tobeto.javaBootcamp.business.response.create.employee.CreateEmployeeResponse;
import com.tobeto.javaBootcamp.business.response.get.employee.GetAllEmployeeResponse;
import com.tobeto.javaBootcamp.business.response.get.employee.GetEmployeeResponse;

import java.util.List;

public interface EmployeeService {

    CreateEmployeeResponse add(CreateEmployeeRequest request);
    List<GetAllEmployeeResponse> getAllEmployee();
    GetEmployeeResponse getByPosition(String position);


}
