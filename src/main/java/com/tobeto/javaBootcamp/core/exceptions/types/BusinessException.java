package com.tobeto.javaBootcamp.core.exceptions.types;

public class BusinessException extends RuntimeException{
    private static final long serialVersiyonUID =1L;
    public BusinessException(String message) {
        super(message);

    }
}

