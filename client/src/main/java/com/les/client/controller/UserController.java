package com.les.client.controller;

import com.les.client.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/users")
public class UserController {

    private RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/{id}")
    public User findById(@PathVariable String id) {
        return restTemplate.getForObject("http://localhost:8081/users/{id}", User.class, id);
    }
}
