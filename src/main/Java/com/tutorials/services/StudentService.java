package com.tutorials.services;

import com.tutorials.Classes.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    Student student;

    public void setStudent(String studentName, String city, String country,int pincode){

    }
}
