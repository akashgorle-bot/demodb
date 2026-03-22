package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/user")
    public Map<String, String> getUser() {
        Map<String, String> user = new HashMap<>();
        user.put("name", "Durgesh");
        user.put("city", "Pune");
        return user;
    }

    @PostMapping("/user")
    public String createUser(@RequestBody String user) {
        return "User created: " + user;
    }
}
