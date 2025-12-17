package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.StudentEntity;

import com.example.demo.service.StudentService;

@RestController
public class Studentcontroller{

@Autowired StudentService ser;

@postMapping("/post")
public studentEntity sendData(@RequestBody studentEntity stu){
  return ser.postdata(stu);
}

}

