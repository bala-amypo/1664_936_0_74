package com.example.demo.entity;

// import java.sql.Data;
import java.util.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer id;
private String name;
private String email;
private String password;
private Date created;


public Date getcreated(){
    return created;
}
public void setcreated(Date created){
    this.created=created;
}
public Integer getId(){
    return id;
}
public void setId(Integer id){
    this.id = id;
}
public String getname(){
    return name;
}
public void setname(String name){
   this.name = name;
}
public String getEmail(){
    return email;
}
public void setEmail(String email){
    this.email = email;
}
public String getpassword(){
    return password;
}
public void setPassword(String password){
    this.password = password;
}

public StudentEntity(Integer id, String name, String email, String password, Date created){
this.id = id;
this.name = name;
this.email = email;
this.password = password;
this.created = created;
}

public StudentEntity(){

}
}

