package com.example.demo.service;


import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Student;

public interface StudentService{

    Student createData(Student stu);
    List<Student> fetchrecord();
    Optional<Student> fetchByID(int id);
    public void deleteData(int id);
}