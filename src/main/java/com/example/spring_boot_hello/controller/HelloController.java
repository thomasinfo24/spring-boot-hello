package com.example.spring_boot_hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // Asegúrate de tener esta anotación
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Bayron Vásquez";
    }
}
