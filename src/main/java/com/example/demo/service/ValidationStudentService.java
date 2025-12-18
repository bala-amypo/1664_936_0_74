package com.example.demo.service;

import com.example.demo.entity.ValidationEntity;
import java.util.List;

public interface ValidationService{
  ValidationEntity postData(ValidationEntity stu);
List<StudentEntity>getAllData();
String DeleteData(int id);
ValidationEntity getData(int id);
ValidationEntity updateData(int id,ValidationEntity entity);
}




