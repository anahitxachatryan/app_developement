package com.restapiexample.SpringName.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.restapiexample.SpringName.repository.UserRepository;
import com.restapiexample.SpringName.model.User;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @PostMapping
    public String create(@RequestBody User user) {
        userRepository.save(user);
        return "User is created";
    }

    @GetMapping
    public List<User> getAllUsers() {
        List<User> users = userRepository.findAll();
        return users;
    }

}