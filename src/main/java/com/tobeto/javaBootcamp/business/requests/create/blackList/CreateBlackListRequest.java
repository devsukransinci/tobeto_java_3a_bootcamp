package com.tobeto.javaBootcamp.business.requests.create.blackList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateBlackListRequest {
    private int id;
    private String reason;
    private  String date;

}
