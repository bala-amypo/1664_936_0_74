package com.example.demo.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import java.time.LocalDateTime;


@Entity
@Data 
@AllArgsConstructor

public class TimeStampEntity{
    private Long id;
    private String username;
    private String email;
    Private LocalDateTime createAt;
    private LocalDateTime updateAt;
     


}