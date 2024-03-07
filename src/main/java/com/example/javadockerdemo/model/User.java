package com.example.javadockerdemo.model;

import jakarta.persistence.*;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document("java")
@Data
public class User {

    @MongoId
    private ObjectId id;

    private String name;
}
