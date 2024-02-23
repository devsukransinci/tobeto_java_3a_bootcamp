package com.tobeto.javaBootcamp.business.abstracts;

import com.tobeto.javaBootcamp.business.requests.create.applicationState.CreateApplicationStateRequest;
import com.tobeto.javaBootcamp.business.response.create.ApplicationState.CreateApplicationStateResponse;
import com.tobeto.javaBootcamp.business.response.get.ApplicationState.GetAllApplicationStateResponse;
import com.tobeto.javaBootcamp.business.response.get.ApplicationState.GetApplicationStateResponse;

import java.util.List;

public interface ApplicationStateService {
    CreateApplicationStateResponse add(CreateApplicationStateRequest request);
    List<GetAllApplicationStateResponse> getAllApplicationState();
    GetApplicationStateResponse getById(int id);
}
