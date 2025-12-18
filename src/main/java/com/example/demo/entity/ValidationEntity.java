package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarata.persistence.GenerationType;
import jakarata.validation.constraints.NotNull;
import jakarata.validation.constraints.Size;
@Entity
public class ValidationEntity{
    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @size(min = 2, max = 0, message = "must be to 10 character")
    private String username;
    @Email(message = "Email is not valid")
    private String email;
@size(min = 2, max = 0, message = "must be to 10 character")
    @NotNull(message = "Password is mandatory")
    private String password;
    @Max(30)
    @Positive(message = "Age must be a positive number")
    private int age;

public String getusername(){
    return name;
}
public void setusername(String username){
    this.id=username;
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

public String getPassword(){
    return password;
}
public void setPassword(String password){
    this.password=password;
}
public String getAge(){
    return age;
}
public void setAge(){
    this.age=age;
}
public ValidationEntity(Long id,)
 @NotNull @Size(min = 2, max = 10, message = "must be 2 to 10 character") String username,
 @Email(message = "Email is not valid") String email,
 @Size(min = 2, max = 0, message = "must be 2 to 10 character") @NotNull(message = "Password is"
 @Max(30) @Positive(message = "Age must be a positive number") int age)
 
 this.id = id;
 this.username = username;
 this.email = email;
 this.password = password;
 this.age = age;
}