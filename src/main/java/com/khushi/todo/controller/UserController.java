package com.khushi.todo.controller;

import com.khushi.todo.model.User;
import com.khushi.todo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserRepository userRepo;

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userRepo.save(user);
    }

    @GetMapping
    public List<User> getAll() { return userRepo.findAll(); }
}
