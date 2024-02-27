package com.tobeto.javaBootcamp.business.response.get.BlackList;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllBlackListResponse {
    private  int id;
    private String reason;
    private  String date;
}
