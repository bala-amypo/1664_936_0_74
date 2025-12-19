package com.example.demo.entity;

import jakarta.validation.constraints.*;
import jakarta.persistence.*;
import jakarta.persistence.Id;
import java.util.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import java.time.LocalDateTime;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.NoAgrsConstructor;
import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinCloumn;
@Entity
@Data
@AllAgrsConstructor
@NoAgrsConstructor
public class StudentIdCard{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

@OneToOne
@JoinColumn(name = "student_id")
private Studentdetails student;


}