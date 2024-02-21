package com.tobeto.javaBootcamp.business.abstracts;
import com.tobeto.javaBootcamp.business.requests.create.applicant.CreateApplicantRequest;
import com.tobeto.javaBootcamp.business.response.create.Applicant.CreateApplicantResponse;
import com.tobeto.javaBootcamp.business.response.get.Applicant.GetAllApplicantResponse;
import com.tobeto.javaBootcamp.business.response.get.Applicant.GetApplicantResponse;

import java.util.List;

public interface ApplicantService {
    CreateApplicantResponse  add(CreateApplicantRequest  request);
    List<GetAllApplicantResponse> getAllApplicant();
    GetApplicantResponse  getByAbout(String about);

}
