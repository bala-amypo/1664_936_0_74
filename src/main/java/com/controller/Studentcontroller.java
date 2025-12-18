package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.putMapping;
import org.springframework.web.bind.annotation.RequstBody;
import java.util.List;

@RestController
public class Studentcontroller{

@Autowired StudentService ser;

@PostMapping("/post")
public StudentEntity postval(@RequestBody StudentEntity entity){
  return ser.postData(entity);
}
@GetMapping("/get")
public List<StudentEntity>getVal(){
  return ser.getAllData();
}
@DeleteMapping("/delete/{id}")
public String deleteVal(@PathVariable int id){
   return ser.DeleteData(id);
}
@GetMapping("/getid/{id}")
public StudentEntity getdataid(@PathVariable int id){
return ser.getData(id);
}
@PutMapping("/put/{id}")
public StudentEntity putval(@PathVariable int id,@RequestBody StudentEntity entity){
return ser.updateData(id,entity);
}

}


