package com.example.demo.exception;

import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException{

@exceptionhandler(ValidationException.class)
public ResponseBody<

}