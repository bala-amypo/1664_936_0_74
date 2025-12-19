package com.example.demo.service;

import com.example.demo.entity.ValidationEntity;
import java.util.List;

public interface ValidationStudentService{
  ValidationEntity postData(ValidationEntity stu);
ValidationEntity getStudentById(Long id);
}




