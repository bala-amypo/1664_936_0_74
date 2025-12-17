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

package
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;

@RestController
public class StudentController{
    @Autowired StudentService ser;
    @PostMapping("/post")
    public StudentEntity sendData(@RequestBody StudentEntity stu){
            return ser.postdata(stu);
    }
}