package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

// import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class DemoController {
    @GetMapping("/api/profiles")
    public Profile getProfile() {
        return new Profile("Hello", 12);
    }
}