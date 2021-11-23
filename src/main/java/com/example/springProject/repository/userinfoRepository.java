package com.example.springProject.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.springProject.model.userinfo;

public interface userinfoRepository extends MongoRepository<userinfo, Integer>{
}
