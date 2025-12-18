package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.pers

@Entity
public class ValidationEntity{
    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private Long id;
    private String username;
    private String email;
    private String password;
    private int age;

}