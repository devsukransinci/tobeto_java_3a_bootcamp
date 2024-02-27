package com.tobeto.javaBootcamp.core.exceptions.problemDetails;

import org.springframework.http.HttpStatus;

public class BusinessProblemDetails extends ProblemDetails{
    public  BusinessProblemDetails (){
        setTitle("Business Rule Violation");
        setType("http://tobeto.com");
        setStatus(HttpStatus.BAD_REQUEST.toString());
    }
}
