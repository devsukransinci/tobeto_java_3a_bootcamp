package com.tobeto.javaBootcamp.business.abstracts;

import com.tobeto.javaBootcamp.business.requests.create.bootcampState.CreateBootcampStateRequest;
import com.tobeto.javaBootcamp.business.response.create.BootcampState.CreateBootcampStateResponse;
import com.tobeto.javaBootcamp.business.response.get.BootcampState.GetAllBootcampStateResponse;
import com.tobeto.javaBootcamp.business.response.get.BootcampState.GetBootcampStateResponse;

import java.util.List;

public interface BootcampStateService {

    CreateBootcampStateResponse add(CreateBootcampStateRequest request);
    List<GetAllBootcampStateResponse> getAllBootcampState();
    GetBootcampStateResponse getById(int id);
}
