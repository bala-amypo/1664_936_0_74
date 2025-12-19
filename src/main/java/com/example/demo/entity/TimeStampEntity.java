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
import lombok.NoArgsConstructor;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TimeStampEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @PrePersist
    public void Oncreate(){
        LocalDateTime now=LocalDateTime.now();
        if (this.createdAt==null){
        this.createdAt = now;
     }
        this.updatedAt = now;
    }
@PreUpdate
public void Onupdate(){
LocalDateTime now=LocalDateTime.now();
    this.updatedAt = now;
}

}