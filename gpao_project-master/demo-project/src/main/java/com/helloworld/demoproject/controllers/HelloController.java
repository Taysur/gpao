package com.helloworld.demoproject.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;




@RestController
@RequestMapping("api/message")
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("Hello Cool IT Help!");
    }
}
