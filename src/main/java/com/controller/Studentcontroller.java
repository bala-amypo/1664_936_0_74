package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.postMapping;
import org.springframework.beans.factory.anntation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class Studentcontroller{

@Autowired StudentService ser;

@postMapping("/post")
public StudentEntity sendData(@RequestBody StudentEntity stu){
  return ser.postData(stu);
}
@GetMapping("/get")
public List<StudentEntity>getVal(){
  return service.getAllData();
}

}

