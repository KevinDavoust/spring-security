package com.wildcodeschool.myProjectWithSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String hello()
    {
        return "Welcome to the SHIELD";
    }

    @GetMapping("/avengers/assemble")
    public String assemble()
    {
        return "Avengers... assemble";
    }

    @GetMapping("/secret-bases")
    public String bases()
    {
        return "liste des campus";
    }
}
