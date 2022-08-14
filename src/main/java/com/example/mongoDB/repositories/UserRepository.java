package com.example.mongoDB.repositories;

import com.example.mongoDB.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository <User, String> {
}
