package com.TheTrueHooha.MySchool.service.Impl;
//implementation class that implements that StudentService class

import com.TheTrueHooha.MySchool.entity.Student;
import com.TheTrueHooha.MySchool.repository.StudentRepository;
import com.TheTrueHooha.MySchool.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//implements the method to get all students
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    //constructor
    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudent() {

        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public Student editStudent(Student student) {
        return studentRepository.save(student);
    }
}
