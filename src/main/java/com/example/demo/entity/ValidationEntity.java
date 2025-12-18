package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarata.persistence.GenerationType;
import jakarata.validation.constraints.NotNull;
import jakarata,.validation.constraints.Size;

@Entity
public class ValidationEntity{
    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 @NotNull
 @size(min = 2, max = 0, message = "must be to 10 character")
    private String username;
    @Email
    private String email;
    private String password;
    private int age;

}