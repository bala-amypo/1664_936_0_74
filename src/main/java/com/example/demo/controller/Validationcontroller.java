package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
impexample.demo.entity.ValidationEntity;ort com.

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
import jakarta.validation.Valid;

@RestController
public class Validationcontroller{
@Autowired ValidationService ser;

@PostMapping("/validpost")
public ValidationEntity postval(@Valid @RequestBody ValidationEntity entity){
  return ser.postData(entity);
}



}


