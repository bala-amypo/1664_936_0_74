package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.ValidationEntity;
import com.example.demo.service.ValidationStudentService;
import com.example.demo.repository.ValidationRepository;
import java.util.List;


@Service
public class ValidationServiceImpl implements ValidationStudentService{
@Autowired ValidationRepository student;


@Override
   public ValidationEntity postData(ValidationEntity stu){
   return student.save(stu);

   }



}

