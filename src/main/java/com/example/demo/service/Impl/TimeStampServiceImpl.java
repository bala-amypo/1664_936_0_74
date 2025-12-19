package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.TimeStampEntity;
import com.example.demo.service.TimeStampService;
import com.example.demo.repository.TimeStampRepository;
import java.util.List;
import com.example.demo.exception.ValidationException;

@Service
public class TimeStampServiceImpl implements TimeStampService{
@Autowired TimeStampRepository student1;


@Override
   public TimeStampEntity postData(TimeStampEntity stu){
   return student1.save(stu);
   }
@Override
public TimeStampEntity getStudentById(Long id){
   return student1.findById(id).orElseThrow(()->new ValidationException("Invalid Id"+id));

}

}

