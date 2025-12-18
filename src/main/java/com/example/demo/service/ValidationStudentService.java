package com.example.demo.service;

import com.example.demo.entity.ValidtEntity;
import java.util.List;

public interface StudentService{
  StudentEntity postData(StudentEntity stu);
List<StudentEntity>getAllData();
String DeleteData(int id);
ValidationEntity getData(int id);
ValidationEntity updateData(int id,ValidationEntity entity);
}




