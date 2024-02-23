package com.tobeto.javaBootcamp.business.abstracts;

import com.tobeto.javaBootcamp.business.requests.create.application.CreateApplicationRequest;
import com.tobeto.javaBootcamp.business.response.create.Application.CreateApplicationResponse;
import com.tobeto.javaBootcamp.business.response.get.Application.GetAllApplicationResponse;
import com.tobeto.javaBootcamp.business.response.get.Application.GetApplicationResponse;

import java.util.List;

public interface ApplicationService {
    CreateApplicationResponse  add(CreateApplicationRequest request);
    List<GetAllApplicationResponse> getAllApplication();
    GetApplicationResponse getById(int id);

}
