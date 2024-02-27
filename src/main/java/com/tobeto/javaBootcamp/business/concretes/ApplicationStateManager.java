
package com.tobeto.javaBootcamp.business.concretes;
import com.tobeto.javaBootcamp.business.abstracts.ApplicationStateService;
import com.tobeto.javaBootcamp.business.requests.create.applicationState.CreateApplicationStateRequest;
import com.tobeto.javaBootcamp.business.response.create.ApplicationState.CreateApplicationStateResponse;
import com.tobeto.javaBootcamp.business.response.get.ApplicationState.GetAllApplicationStateResponse;
import com.tobeto.javaBootcamp.business.response.get.ApplicationState.GetApplicationStateResponse;
import com.tobeto.javaBootcamp.core.utilities.mapping.ModelMapperService;
import com.tobeto.javaBootcamp.dataAccess.abstracts.ApplicationStateRepository;
import com.tobeto.javaBootcamp.entities.concretes.ApplicationState;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;
@Service
@AllArgsConstructor
public class ApplicationStateManager implements ApplicationStateService {
    private ApplicationStateRepository applicationStateRepository;
    private ModelMapperService mapperService;
    @Override
    public CreateApplicationStateResponse add(CreateApplicationStateRequest request) {
        ApplicationState applicationState =mapperService.forRequest().map(request,ApplicationState.class);
        //applicationState.setId(request.getId());
        applicationStateRepository.save(applicationState);
        CreateApplicationStateResponse response =mapperService.forResponse().map(applicationState,CreateApplicationStateResponse.class);
        return response;
    }

    @Override
    public List<GetAllApplicationStateResponse> getAllApplicationState() {
        List<ApplicationState>applicationStates=applicationStateRepository.findAll();

        List<GetAllApplicationStateResponse>applicationStateResponses= applicationStates.stream().map(applicationState ->
                        mapperService.forResponse().map(applicationState, GetAllApplicationStateResponse.class))
                .collect(Collectors.toList());


        return applicationStateResponses;
    }

    @Override
    public GetApplicationStateResponse getById(int id) {
        ApplicationState applicationState =applicationStateRepository.getById(id);
        GetApplicationStateResponse response=  mapperService.forResponse().map(applicationState,GetApplicationStateResponse.class);
        return response;
    }
}
