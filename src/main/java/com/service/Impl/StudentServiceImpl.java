package com.example.demo.service.Impl;

import org.springframework.stereotype.Service;

import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
@Autowired StudentRepository student
//save();
//findAll();
//findbyId();
//deletebyId();
//existsById();

@Override
   public StudentEntity postData(StudentEntity stu){
   return student.save(stu);

   }

}