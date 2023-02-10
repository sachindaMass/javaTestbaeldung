package com.example.baeldung.controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello";
    }
}
