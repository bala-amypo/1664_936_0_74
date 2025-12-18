package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Positive;


@Entity


public class ValidationEntity{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min=2,max=6,message="require 2 to 6 characters")
    private String username;
    @Email(message="Email is not valid")
    private String email;
    @Size(min=2,max=6,message="should be less than 6")
    @NotNull
    private String password;
    @Max(30)
    @Positive(message="age could not be negative")
    private int age;
      
    public String getUserName(){
        return username;
    }
    public void setUserName(){
        this.username=username;
    }

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }

    public String getpassword(){
        return password;
    }
    public void setpassword(String password){
        this.password=password;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }

     
    public ValidationEntity(  Long id,
    @NotNull
    @Size(min=2,max=6,message="require 2 to 6 characters")
     String name,
    @Email(message="Email is not valid")
     String email,
    @Size(min=2,max=6,message="should be less than 6")
    @NotNull
    @Positive(message="age could not be negative")
     int age){
       this.id=id;
        this.name=name;
        this.email=email;
        this.password=password;
        this.age=age;

        
    }
     
}