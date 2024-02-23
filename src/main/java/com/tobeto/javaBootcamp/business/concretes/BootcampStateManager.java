package com.tobeto.javaBootcamp.business.concretes;

import com.tobeto.javaBootcamp.business.abstracts.BootcampStateService;
import com.tobeto.javaBootcamp.business.requests.create.bootcampState.CreateBootcampStateRequest;
import com.tobeto.javaBootcamp.business.response.create.Bootcamp.CreateBootcampResponse;
import com.tobeto.javaBootcamp.business.response.create.BootcampState.CreateBootcampStateResponse;
import com.tobeto.javaBootcamp.business.response.get.Bootcamp.GetAllBootcampResponse;
import com.tobeto.javaBootcamp.business.response.get.BootcampState.GetAllBootcampStateResponse;
import com.tobeto.javaBootcamp.business.response.get.BootcampState.GetBootcampStateResponse;
import com.tobeto.javaBootcamp.core.utilities.mapping.ModelMapperService;
import com.tobeto.javaBootcamp.dataAccess.abstracts.BootcampRepository;
import com.tobeto.javaBootcamp.dataAccess.abstracts.BootcampStateRepository;
import com.tobeto.javaBootcamp.entities.concretes.Bootcamp;
import com.tobeto.javaBootcamp.entities.concretes.BootcampState;

import java.util.List;
import java.util.stream.Collectors;

public class BootcampStateManager implements BootcampStateService {
    private BootcampStateRepository bootcampStateRepository;
    private ModelMapperService mapperService;
    @Override
    public CreateBootcampStateResponse add(CreateBootcampStateRequest request) {

        BootcampState bootcampState =mapperService.forRequest().map(request,BootcampState.class);
        bootcampState.setId(request.getId());
        bootcampStateRepository.save(bootcampState);
        CreateBootcampStateResponse response =mapperService.forResponse().map(bootcampState,CreateBootcampStateResponse.class);

        return response;
    }

    @Override
    public List<GetAllBootcampStateResponse> getAllBootcampState() {
        List<BootcampState> bootcampStates =bootcampStateRepository.findAll();
        List<GetAllBootcampStateResponse> bootcampStateResponses = bootcampStates.stream().map(bootcampState ->
                mapperService.forResponse().map(bootcampState, GetAllBootcampStateResponse.class)).collect(Collectors.toList());
        return bootcampStateResponses;
    }

    @Override
    public GetBootcampStateResponse getById(int id) {
        return null;
    }
}