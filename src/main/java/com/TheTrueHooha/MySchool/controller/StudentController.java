package com.TheTrueHooha.MySchool.controller;

import com.TheTrueHooha.MySchool.entity.Student;
import com.TheTrueHooha.MySchool.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    private StudentService studentService;

    //a constructor for the student service controller
    public StudentController(StudentService studentService) {
        super();
        this.studentService = studentService;
    }

    //a get method to handle students request
    @GetMapping ("/students")
    public String listStudents ( Model model) {
        model.addAttribute("students", studentService.getAllStudent());
        return "students";
    }

    //post method to handle creating of new students
    @GetMapping ("/students/create-new")
    public String createStudent (Model model) {

        //creates a new student object to hold student data
        Student student = new Student();
        model.addAttribute("student", student);
        return "create-new";
    }

    //method to handle POST request to save student data
    @PostMapping ("/students")
    public String saveStudent (@ModelAttribute ("student") Student student) {
        studentService.saveStudent(student);
        return "redirect:/student";
    }
}
