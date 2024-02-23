package com.tobeto.javaBootcamp.webApi.controllers;

import com.tobeto.javaBootcamp.core.utilities.results.DataResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {
    public ResponseEntity <?> handleDataResult(DataResult<?>dataResult){
        if (dataResult.isSuccess()){
            return ResponseEntity.ok(dataResult);

        }
        return ResponseEntity.badRequest().body(dataResult);
    }
}
