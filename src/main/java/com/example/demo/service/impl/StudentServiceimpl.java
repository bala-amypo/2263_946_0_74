package com.example.demo.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceimpl implements StudentService{
    @Autowired
    StudentRepository repo;

    public Student createData(Student stu){
        return repo.save(stu);
    }

    public List<Student> fetchrecord(){
        return repo.findAll();
    }
}