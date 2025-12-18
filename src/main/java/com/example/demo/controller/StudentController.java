package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
        Optional<Student>student=ser.fetchByID(id);
        if(student.isPresent()){
        stu.setId(id);
        ser.createData(stu);
        }
        else{
            return id+"Data not found";
        }
        return "Data updated successfully";
    }
    @DeleteMapping("/deletedata/{id}")
    public String deleteData(@PathVariable int id){
        Optional<Student>student=ser.fetchByID(id);
        if(student.isPresent()){
            ser.deleteData(id);
            return "Data deleted successfully";
        }
        else{
            return id+" Data not found";
        }
        
    }
}