package com.example.controller; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.bean.Hello;
import com.example.repository.HelloRepository;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class HelloController {

    @Autowired
    private HelloRepository repo;

    @GetMapping("/test")
    public String test() {
        return "Backend is running";
    }

    @PostMapping("/save")
    public Hello saveHello(@RequestBody Hello hello) {
        return repo.save(hello);
    }
}