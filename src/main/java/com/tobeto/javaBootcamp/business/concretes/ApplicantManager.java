package com.tobeto.javaBootcamp.business.concretes;

import com.tobeto.javaBootcamp.business.abstracts.ApplicantService;
import com.tobeto.javaBootcamp.business.requests.create.applicant.CreateApplicantRequest;
import com.tobeto.javaBootcamp.business.requests.create.employee.CreateEmployeeRequest;
import com.tobeto.javaBootcamp.business.response.create.Applicant.CreateApplicantResponse;
import com.tobeto.javaBootcamp.business.response.create.employee.CreateEmployeeResponse;
import com.tobeto.javaBootcamp.business.response.get.Applicant.GetAllApplicantResponse;
import com.tobeto.javaBootcamp.business.response.get.Applicant.GetApplicantResponse;
import com.tobeto.javaBootcamp.business.response.get.employee.GetAllEmployeeResponse;
import com.tobeto.javaBootcamp.core.utilities.mapping.ModelMapperService;
import com.tobeto.javaBootcamp.dataAccess.abstracts.ApplicantRepository;
import com.tobeto.javaBootcamp.dataAccess.abstracts.EmployeeRepository;
import com.tobeto.javaBootcamp.entities.concretes.Applicant;
import com.tobeto.javaBootcamp.entities.concretes.Employee;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ApplicantManager implements ApplicantService {
    private ApplicantRepository  applicantRepository;
    private ModelMapperService mapperService;

    @Override
    public CreateApplicantResponse add(CreateApplicantRequest request) {
        Applicant applicant =mapperService.forRequest().map(request,Applicant.class);
        applicant.setAbout(request.getAbout());
        applicantRepository.save(applicant);
        CreateApplicantResponse response =mapperService.forResponse().map(applicant,CreateApplicantResponse.class);
        return response;
    }



    @Override
    public List<GetAllApplicantResponse> getAllApplicant() {
        List<Applicant> applicants=applicantRepository.findAll();
        List<GetAllApplicantResponse> applicantResponses = applicants.stream().map(applicant ->
                        mapperService.forResponse().map(applicant,GetAllApplicantResponse.class))
                .collect(Collectors.toList());
        return applicantResponses;
    }

    @Override
    public GetApplicantResponse getByAbout(String about) {
        Applicant applicant =applicantRepository.getByAbout(about);
        GetApplicantResponse response =
                mapperService.forResponse().map(applicant,GetApplicantResponse.class);

        return response;
    }



}
