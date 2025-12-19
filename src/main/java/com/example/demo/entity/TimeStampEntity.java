package com.example.demo.entity;



@Entity
@Data 
@AllArgsConstructor
public class TimeStampEntity{
    private Long id;
    private String username;
    private String email;
    private String password;
    private Date created;

}