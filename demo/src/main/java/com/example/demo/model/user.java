package com.example.demo.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;


@Getter
@Setter
@Entity
@Table(name = "users")


public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String user_name;
    private String password;
    private String email;
    private String gender;
}
