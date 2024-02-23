package com.tobeto.javaBootcamp.business.concretes;

import com.tobeto.javaBootcamp.business.abstracts.BootcampService;
import com.tobeto.javaBootcamp.business.requests.create.bootcamp.CreateBootcampRequest;
import com.tobeto.javaBootcamp.business.response.create.Bootcamp.CreateBootcampResponse;
import com.tobeto.javaBootcamp.business.response.get.Bootcamp.GetAllBootcampResponse;
import com.tobeto.javaBootcamp.business.response.get.Bootcamp.GetBootcampResponse;
import com.tobeto.javaBootcamp.core.utilities.mapping.ModelMapperService;
import com.tobeto.javaBootcamp.dataAccess.abstracts.ApplicationStateRepository;
import com.tobeto.javaBootcamp.dataAccess.abstracts.BootcampRepository;
import com.tobeto.javaBootcamp.entities.concretes.Bootcamp;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class BootcampManager implements BootcampService {
    private BootcampRepository  bootcampRepository;
    private ModelMapperService mapperService;
    @Override
    public CreateBootcampResponse add(CreateBootcampRequest request) {
        Bootcamp bootcamp =mapperService.forRequest().map(request,Bootcamp.class);
        bootcamp.setId(request.getId());
        bootcampRepository.save(bootcamp);
        CreateBootcampResponse response =mapperService.forResponse().map(bootcamp,CreateBootcampResponse.class);

        return response;
    }

    @Override
    public List<GetAllBootcampResponse> getAllBootcamp() {
        List<Bootcamp> bootcamps =bootcampRepository.findAll();
        List<GetAllBootcampResponse> bootcampResponses = bootcamps.stream().map(bootcamp ->
                mapperService.forResponse().map(bootcamp, GetAllBootcampResponse.class)).collect(Collectors.toList());
        return bootcampResponses;
    }

    @Override
    public GetBootcampResponse getById(int id) {
        return null;
    }
}
