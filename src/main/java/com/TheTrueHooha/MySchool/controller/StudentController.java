package com.TheTrueHooha.MySchool.controller;

import com.TheTrueHooha.MySchool.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    private StudentService studentService;

    //a constructor for the student service controller
    public StudentController(StudentService studentService) {
        super();
        this.studentService = studentService;
    }

    //a request method to handle students request
    @GetMapping ("/students")
    public String listStudent ( Model model) {
        model.addAttribute("students", studentService.getAllStudent());
        return "students";
    }
}
