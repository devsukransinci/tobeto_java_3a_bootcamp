package com.tobeto.javaBootcamp.business.concretes;

import com.tobeto.javaBootcamp.business.abstracts.BlackListService;
import com.tobeto.javaBootcamp.business.constants.BlackListMessage;
import com.tobeto.javaBootcamp.business.requests.create.blackList.CreateBlackListRequest;
import com.tobeto.javaBootcamp.business.response.create.BlackList.CreateBlackListResponse;
import com.tobeto.javaBootcamp.business.response.get.BlackList.GetAllBlackListResponse;
import com.tobeto.javaBootcamp.business.response.get.BlackList.GetBlackListResponse;
import com.tobeto.javaBootcamp.business.response.get.Intructor.GetInstructorResponse;
import com.tobeto.javaBootcamp.core.utilities.mapping.ModelMapperService;
import com.tobeto.javaBootcamp.core.utilities.results.DataResult;
import com.tobeto.javaBootcamp.core.utilities.results.SuccessDataResult;
import com.tobeto.javaBootcamp.dataAccess.abstracts.BlackListRepository;
import com.tobeto.javaBootcamp.entities.concretes.BlackList;
import com.tobeto.javaBootcamp.entities.concretes.Instructor;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor

public class BlackListManager implements BlackListService {
    private BlackListRepository blackListRepository;
    private ModelMapperService mapperService;


    @Override
    public DataResult<CreateBlackListResponse> add(CreateBlackListRequest request) {
        BlackList blackList =mapperService.forRequest().map(request,BlackList.class);
        blackListRepository.save(blackList);
        CreateBlackListResponse response =mapperService.forResponse()
                .map(blackList,CreateBlackListResponse.class);
        return new
                SuccessDataResult<CreateBlackListResponse>
                (response, BlackListMessage.BlackListAdded);

    }

    @Override
    public List<GetAllBlackListResponse> getAllBlackList() {
        List<BlackList> blackLists = blackListRepository.findAll();
        return blackLists.stream()
                .map(blackList -> mapperService.forResponse().map(blackList, GetAllBlackListResponse.class))
                .collect(Collectors.toList());
    }

    @Override
    public GetBlackListResponse getByDate(String date) {
        BlackList blackList=blackListRepository.getByDate(date);
        GetBlackListResponse response=
                mapperService.forResponse().map(blackList,GetBlackListResponse.class);

        return  response;
    }
}
