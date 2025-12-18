package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.ValidationEntity;
import com.example.demo.service.ValidationService;
import com.example.demo.repository.ValidationRepository;
import java.util.List;


@Service
public class ValidationServiceImpl implements ValidationServiceImpl{
@Autowired StudentRepository student;
//save()
//findAll()
//findbyId()
//deletebyId()
//existsById()

@Override
   public StudentEntity postData(StudentEntity stu){
   return student.save(stu);

   }



}

