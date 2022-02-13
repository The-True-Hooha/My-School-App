package com.TheTrueHooha.MySchool.controller;

import com.TheTrueHooha.MySchool.entity.Student;
import com.TheTrueHooha.MySchool.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    //method to handle PUT requests
    @GetMapping ("/students/edit/{id}")
    public String updateStudent (@PathVariable Long id, Model model){
        model.addAttribute("student", studentService.getStudentById(id));
        return "update-student";
    }

    //method to update student form request
    @PostMapping ("/student/{id}")
    public String checkStudent (@PathVariable Long id, @ModelAttribute("student") Student student, Model model){

        //gets all the student from the database by Id
        Student allStudents = studentService.getStudentById(id);
        allStudents.setRegNo(id);
        allStudents.setFirstName(student.getFirstName());
        allStudents.setLastName(student.getLastName());
        allStudents.setEmail(student.getEmail());
        allStudents.setGender(student.getGender());
        allStudents.setDob(student.getDob());
        allStudents.setHomeAddress(student.getHomeAddress());

        //saves the updated student profile
        studentService.editStudent(allStudents);
        return "redirect/students";
    }
}
