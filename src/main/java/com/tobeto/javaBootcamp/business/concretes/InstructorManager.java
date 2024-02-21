package com.tobeto.javaBootcamp.business.concretes;

import com.tobeto.javaBootcamp.business.abstracts.InstructorService;
import com.tobeto.javaBootcamp.business.requests.create.instructor.CreateInstructorRequest;
import com.tobeto.javaBootcamp.business.requests.create.user.CreateUserRequest;
import com.tobeto.javaBootcamp.business.response.create.Intructor.CreateInstructorResponse;
import com.tobeto.javaBootcamp.business.response.create.user.CreateUserResponse;
import com.tobeto.javaBootcamp.business.response.get.Intructor.GetAllInstructorResponse;
import com.tobeto.javaBootcamp.business.response.get.Intructor.GetInstructorResponse;
import com.tobeto.javaBootcamp.core.utilities.mapping.ModelMapperService;
import com.tobeto.javaBootcamp.dataAccess.abstracts.InstructorRepository;
import com.tobeto.javaBootcamp.entities.concretes.Instructor;
import com.tobeto.javaBootcamp.entities.concretes.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor

public class InstructorManager implements InstructorService {
    private InstructorRepository instructorRepository;
    private ModelMapperService mapperService;



    @Override
    public CreateInstructorResponse add(CreateInstructorRequest request) {

        Instructor instructor =mapperService.forRequest().map(request,Instructor.class);
        instructor.setCompanyName(request.getCompanyName());
        instructorRepository.save(instructor);
        CreateInstructorResponse response =mapperService.forResponse().map(instructor,CreateInstructorResponse.class);
        return response;
    }


    @Override
    public List<GetAllInstructorResponse> getAllInstructor() {
        List<Instructor> instructors=instructorRepository.findAll();
        List<GetAllInstructorResponse> instructorResponses =instructors.stream().map(instructor ->
                mapperService.forResponse().map(instructor,GetAllInstructorResponse.class))
                .collect(Collectors.toList());
        return instructorResponses;
    }

    @Override
    public GetInstructorResponse getByCompanyName(String companyName) {
        Instructor instructor=instructorRepository.getByCompanyName(companyName);
        GetInstructorResponse response=
                mapperService.forResponse().map(instructor,GetInstructorResponse.class);

        return  response;
    }
}
