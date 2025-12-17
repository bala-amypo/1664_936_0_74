package com.example.demo.entity;

// import java.sql.Data;
import java.util.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Studententity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
private integer id;
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
    retrun id;
}
public void setId(integer id){
    this.id = id;
}
public String getname(){
    retrun name;
}
public void setname(String name){
   this.name = name;
}
public String getEmail(){
    retrun email;
}
public void setEmail(String Email){
    this.email = email
}
public String getpassword(){
    retrun password;
}
public void setPassword(String password){
    this.password = password;
}

public StudentEntity(Inter id, String name, String email, String password, Data created){
this.id = id;
this.name = name;
this.email = email;
this.password = password;
this.created = created;
}

public StudentEntity(){

}
}

