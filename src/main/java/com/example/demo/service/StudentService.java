package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {
  //Map<Integer,Student>data=new HashMap<>();
  
  @Autowired
  StudentRepository repo;
    public Student createData(Student stu) {
      return repo.save(stu);
      // data.put(stu.getId(),stu);  //key=id,value=student object
       //return stu;
    }
    public List<Student> fetchrecord(){
      return repo.findAll();
    }
  }
