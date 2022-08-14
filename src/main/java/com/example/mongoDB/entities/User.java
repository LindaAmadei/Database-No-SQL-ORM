package com.example.mongoDB.entities;

import org.springframework.data.annotation.Id;

@Entity

public class User {

    @Id
    private String id;
    private String firstName;
    private String lastName;
}
