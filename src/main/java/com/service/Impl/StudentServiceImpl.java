package com.example.demo.service.Impl;

import org.springframework.stereotype.service;

import com.example.demo.service.StudentService;

@service

public class StudentServiceImpl implements StudentService{
@Autowired StudentRepository student;
//save
//findAll()
//findbyId()
//deletebyId()
//exists

   public StudentEntity postData(StudentEntity stu){

   }

}