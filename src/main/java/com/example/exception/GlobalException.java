package com.example.demo.exception;

import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.Exception
import org.springframework.web.bind.annotation.ResponseBody

@RestControllerAdvice
public class GlobalException{

@exceptionhandler(ValidationException.class)
public ResponseBody<String> handleValidationExecption(){

}

}