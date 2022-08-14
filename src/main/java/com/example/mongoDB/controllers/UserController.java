package com.example.mongoDB.controllers;


import com.example.mongoDB.entities.User;
import com.example.mongoDB.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    //per creare utente ci serve il repository, unica classe responsabile di comunicare con db
    @Autowired
    private UserRepository userRepository;

    @PostMapping("")  //crea utente
    public User createUser (@RequestBody User user) {
        return userRepository.save(user);

    }


    @GetMapping  //prendi utente
    public List<User> getUser(){
        return userRepository.findAll();

    }

    @GetMapping("/{id}")
    public Optional<User> getUser(@PathVariable String id) {
        return userRepository.findById(id);
    }

}
