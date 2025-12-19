package com.example.demo.entity;

import jakarta.validation.constraints.*;
import jakarta.persistence.*;
import jakarta.persistence.Id;
import java.util.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import java.time.LocalDateTime;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.NoAgrsConstructor;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

@Entity
@Data
@AllAgrsConstructor
@NoAgrsConstructor
public class StudentIdCard{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

   

}