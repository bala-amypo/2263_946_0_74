package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.persistence.Id;

@Entity           //automates the table creation
 //`@Table()
public class Student{                             //in entity -> class name=table name

    @Id           //primary key annotation
    private int id;   
    // @GeneratedValue(strategy=GenerationType.IDENTITY)      //auto increment    -> if this given means remove 'this.id=id' in parameterized constructor, if not given means keep it
    private String name;
    private String email;       //columns of table ->id,name,email,cgpa

    private String cgpa;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCgpa() {
        return cgpa;
    }

    public void setCgpa(String cgpa) {
        this.cgpa = cgpa;
    }
    public Student(int id, String name, String email,String cgpa ) { //parameterized constructor for setting values
        this.id = id;            
        this.name = name;
        this.email = email;
        this.cgpa = cgpa;
    }

    public Student() {    //default constructor for getting values
    
    }
}