package com.tobeto.javaBootcamp.business.abstracts;
import com.tobeto.javaBootcamp.business.requests.create.blackList.CreateBlackListRequest;
import com.tobeto.javaBootcamp.business.response.create.BlackList.CreateBlackListResponse;
import com.tobeto.javaBootcamp.business.response.get.BlackList.GetAllBlackListResponse;
import com.tobeto.javaBootcamp.business.response.get.BlackList.GetBlackListResponse;
import com.tobeto.javaBootcamp.core.utilities.results.DataResult;


import java.util.List;

public interface BlackListService {
    DataResult<CreateBlackListResponse> add(CreateBlackListRequest request);
    List<GetAllBlackListResponse> getAllBlackList();

    GetBlackListResponse getByDate(String date);
}
