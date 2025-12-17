package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
    
    @Autowired
    StudentService ser;
    
    @PostMapping("/adddata")
    public Student createData(@RequestBody Student stu){
        return ser.createData(stu);
    }

    @GetMapping("/fetche")
    public List<Student> fetchrecord(){
        return ser.fetchrecord();
    }
    @GetMapping("/fetchbyid/{id}")
    public Optional<Student> fetchByID(@PathVariable int id){
        return ser.fetchByID(id);
    }
    @PutMapping("/updatedata/{id}")
    public String updateDate(@PathVariable int id,@RequestBody Student stu){
        stu.setId(id);
        ser.createData(stu);
        return "Data updated successfully";
    }
}