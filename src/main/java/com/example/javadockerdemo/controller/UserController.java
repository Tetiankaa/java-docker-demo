package com.example.javadockerdemo.controller;

import com.example.javadockerdemo.dao.UserDAO;
import com.example.javadockerdemo.model.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {

    private final UserDAO userDAO;

    @GetMapping
    public List<User> getAll(){
        return userDAO.findAll();
    }

    @PostMapping
    public User create(@RequestBody User user){
        return userDAO.save(user);
    }
}
