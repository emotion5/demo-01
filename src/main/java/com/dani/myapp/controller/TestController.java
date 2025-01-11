package com.dani.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.dani.myapp.dto.UserData;
import com.dani.myapp.repository.UserDataRepository;

import java.util.List;

@RestController
public class TestController {
    
    @Autowired
    private UserDataRepository userDataRepository;
    
    @GetMapping("/")
    public String home() {
        return "Hello, it's start";
    }
    
    @GetMapping("/test")
    public String test() {
        return "Hello, it's test";
    }

    @PostMapping("/save")
    public ResponseEntity<String> saveData(@RequestBody UserData userData) {
        userDataRepository.save(userData);
        return ResponseEntity.ok("Data saved successfully to SQLite database");
    }

    @GetMapping("/users")
    public ResponseEntity<List<UserData>> getAllUsers() {
        List<UserData> users = userDataRepository.findAll();
        return ResponseEntity.ok(users);
    }
}