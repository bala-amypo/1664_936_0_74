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
    @Email(message = "Email is not valid")
    private String email;
@size(min = 2, max = 0, message = "must be to 10 character")
    @NotNull(message = "Password is mandatory")
    private String password;
    @Size(min = 2, max = 30,)
    @Positive(message = "Age must be a positive number")
    private int age;

}