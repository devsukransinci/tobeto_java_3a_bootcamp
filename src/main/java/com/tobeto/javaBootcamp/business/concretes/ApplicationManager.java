package com.tobeto.javaBootcamp.business.concretes;
import com.tobeto.javaBootcamp.business.abstracts.ApplicationService;
import com.tobeto.javaBootcamp.business.requests.create.application.CreateApplicationRequest;
import com.tobeto.javaBootcamp.business.response.create.Application.CreateApplicationResponse;
import com.tobeto.javaBootcamp.business.response.get.Application.GetAllApplicationResponse;
import com.tobeto.javaBootcamp.business.response.get.Application.GetApplicationResponse;
import com.tobeto.javaBootcamp.core.utilities.mapping.ModelMapperService;
import com.tobeto.javaBootcamp.dataAccess.abstracts.ApplicationRepository;
import com.tobeto.javaBootcamp.entities.concretes.Application;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@AllArgsConstructor
public class ApplicationManager implements ApplicationService  {
    private  ApplicationRepository applicationRepository;
    private ModelMapperService mapperService;
    @Override
    public CreateApplicationResponse add(CreateApplicationRequest request) {
        Application application =mapperService.forRequest().map(request,Application.class);
        application.setId(request.getId());
        applicationRepository.save(application);
        CreateApplicationResponse response =mapperService.forResponse().map(application,CreateApplicationResponse.class);
        return response;
    }

    @Override
    public List<GetAllApplicationResponse> getAllApplication() {
        List<Application>applications=applicationRepository.findAll();
        List<GetAllApplicationResponse>applicationResponses= applications.stream().map(application ->
                        mapperService.forResponse().map(application, GetAllApplicationResponse.class))
                .collect(Collectors.toList());


        return applicationResponses;
    }

    @Override
    public GetApplicationResponse getById(int id) {
        Application application =applicationRepository.getById(id);
        GetApplicationResponse response=  mapperService.forResponse().map(application,GetApplicationResponse.class);
        return response;
    }
}

