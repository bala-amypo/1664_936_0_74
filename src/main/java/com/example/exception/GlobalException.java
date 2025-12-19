package com.example.demo.exception;

import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody

@RestControllerAdvice
public class GlobalException{

@exceptionHandler(ValidationException.class)
public ResponseBody<String> handleValidationExecption(ValidationException ex){
return new ResponseBody<String>(ex.getMessage(),HttpStatus.BAD_GATEWAY);


}

}