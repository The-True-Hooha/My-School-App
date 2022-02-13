package com.TheTrueHooha.MySchool.service;

import com.TheTrueHooha.MySchool.entity.Student;

import java.util.List;

public interface StudentService {

    //defines a method that gets al students
    List <Student> getAllStudent ();

    //defines a method to save student data
    Student saveStudent (Student student);

    //method to update student data from the database
    Student getStudentById (Long id);
    Student editStudent (Student student);
}
