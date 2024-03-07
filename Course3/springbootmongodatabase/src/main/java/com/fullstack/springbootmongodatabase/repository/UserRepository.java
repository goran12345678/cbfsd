package com.fullstack.springbootmongodatabase.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.fullstack.springbootmongodatabase.model.User;

public interface UserRepository extends MongoRepository<User, String>{

}
