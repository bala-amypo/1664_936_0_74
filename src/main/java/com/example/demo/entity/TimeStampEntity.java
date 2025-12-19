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

@Entity
@Data
@Getter
@Setter
@AllAgrsConstructor
@NoAgrsConstructor
public class TimeStampEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @PerPersist
    public void Oncreate(){
        LocalDateTime noe = LocalDataTime().now();
        this.createdAt = now;
        this.updatedAt = now;
    }
@PerUpdate
public void Onupdate(){
    this.updatedAt = now;
}
}
