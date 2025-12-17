package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.studentEntity;

import com.example.demo.service.StudentService;

@RestController
public class Studentcontroller{
    
@Autowired StudentService ser;

@postMapping("/post")
public studentEntity sendData(@RequetBody studentEntity stu){
  return ser.postData(stu);
}

}