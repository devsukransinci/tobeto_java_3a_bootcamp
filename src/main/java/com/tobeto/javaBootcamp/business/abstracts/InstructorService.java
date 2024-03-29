package com.tobeto.javaBootcamp.business.abstracts;

import com.tobeto.javaBootcamp.business.requests.create.instructor.CreateInstructorRequest;
import com.tobeto.javaBootcamp.business.response.create.Intructor.CreateInstructorResponse;
import com.tobeto.javaBootcamp.business.response.get.Intructor.GetAllInstructorResponse;
import com.tobeto.javaBootcamp.business.response.get.Intructor.GetInstructorResponse;
import com.tobeto.javaBootcamp.core.utilities.paging.PageDto;
import com.tobeto.javaBootcamp.core.utilities.results.DataResult;

import java.util.List;

public interface InstructorService {
    CreateInstructorResponse add(CreateInstructorRequest request);
    List<GetAllInstructorResponse> getAllInstructor();

    GetInstructorResponse getByCompanyName(String companyName);

    DataResult<List <GetAllInstructorResponse>> getAllPage(PageDto pageDto);


}
