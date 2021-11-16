package com.les.controller;

import com.les.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/{id}")
    public User findById(@PathVariable String id) {
        return new User(id, UUID.randomUUID().toString());
    }
}
