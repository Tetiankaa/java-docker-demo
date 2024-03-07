package com.example.javadockerdemo.dao;

import com.example.javadockerdemo.model.User;
import org.bson.types.ObjectId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends MongoRepository<User, ObjectId> {
}
