package com.tobeto.javaBootcamp.business.response.get.BlackList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetBlackListResponse {
    private int id;
    private String reason;
    private  String date;
}
