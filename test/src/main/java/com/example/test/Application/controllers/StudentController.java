package com.example.test.Application.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")


public class StudentController {

    @GetMapping("/list")
    public String list() {
        return "List of students";
    }

    @PostMapping("/add")
    public String add() {
        return "Student added";
    }
}
