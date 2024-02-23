package com.tobeto.javaBootcamp.business.abstracts;

import com.tobeto.javaBootcamp.business.requests.create.applicationState.CreateApplicationStateRequest;
import com.tobeto.javaBootcamp.business.requests.create.bootcamp.CreateBootcampRequest;
import com.tobeto.javaBootcamp.business.response.create.ApplicationState.CreateApplicationStateResponse;
import com.tobeto.javaBootcamp.business.response.create.Bootcamp.CreateBootcampResponse;
import com.tobeto.javaBootcamp.business.response.get.ApplicationState.GetAllApplicationStateResponse;
import com.tobeto.javaBootcamp.business.response.get.Bootcamp.GetAllBootcampResponse;
import com.tobeto.javaBootcamp.business.response.get.Bootcamp.GetBootcampResponse;
import com.tobeto.javaBootcamp.business.response.get.user.GetUserResponse;

import java.util.List;

public interface BootcampService {
    CreateBootcampResponse add(CreateBootcampRequest request);
    List<GetAllBootcampResponse> getAllBootcamp();
    GetBootcampResponse  getById(int id);
}
