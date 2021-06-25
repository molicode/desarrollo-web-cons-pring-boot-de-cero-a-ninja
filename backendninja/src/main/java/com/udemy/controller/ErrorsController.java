package com.udemy.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorsController {

    private static final String INTERNAL_SERVER_ERROR = "error/500";

    @ExceptionHandler(Exception.class)
    public String show404(){
        return INTERNAL_SERVER_ERROR;
    }

}
