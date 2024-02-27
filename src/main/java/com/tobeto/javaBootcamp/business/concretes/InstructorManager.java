package com.tobeto.javaBootcamp.business.concretes;

import com.tobeto.javaBootcamp.business.abstracts.InstructorService;
import com.tobeto.javaBootcamp.business.requests.create.instructor.CreateInstructorRequest;
import com.tobeto.javaBootcamp.business.response.create.Intructor.CreateInstructorResponse;
import com.tobeto.javaBootcamp.business.response.get.Intructor.GetAllInstructorResponse;
import com.tobeto.javaBootcamp.business.response.get.Intructor.GetInstructorResponse;
import com.tobeto.javaBootcamp.core.exceptions.types.BusinessException;
import com.tobeto.javaBootcamp.core.utilities.mapping.ModelMapperService;
import com.tobeto.javaBootcamp.core.utilities.paging.PageDto;
import com.tobeto.javaBootcamp.core.utilities.results.DataResult;
import com.tobeto.javaBootcamp.core.utilities.results.SuccessDataResult;
import com.tobeto.javaBootcamp.dataAccess.abstracts.InstructorRepository;
import com.tobeto.javaBootcamp.entities.concretes.Instructor;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor

public class InstructorManager implements InstructorService {
    private InstructorRepository instructorRepository;
    private ModelMapperService mapperService;
    @Override
    public CreateInstructorResponse add(CreateInstructorRequest request) {
      checkfBrandNameExists(request.getCompanyName());
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

    @Override
    public DataResult<List<GetAllInstructorResponse>> getAllPage(PageDto pageDto) {
        Sort sort =Sort.by(Sort.Direction.fromString
                (pageDto.getSortDirection()),pageDto.getSortBy());
        Pageable pageable = PageRequest.of(pageDto.getPageNumber(),pageDto.getPageSize(),sort);
        Page <Instructor> instructors=instructorRepository.findAll(pageable);
        List<GetAllInstructorResponse> responses=instructors.stream().map(instructor ->
          mapperService.forResponse().map(instructor,GetAllInstructorResponse.class)).toList();
        return new SuccessDataResult < List<GetAllInstructorResponse>>(responses);


    }

    private  void checkfBrandNameExists(String name){
        Instructor instructor= (Instructor) instructorRepository.findByNameIgnoreCase(name);
        if (instructor!=null){
            throw  new BusinessException("boyle bir egitmen daha önce eklendi");
        }
    }

}
