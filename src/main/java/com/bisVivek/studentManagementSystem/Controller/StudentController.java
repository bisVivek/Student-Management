package com.bisVivek.studentManagementSystem.Controller;

import com.bisVivek.studentManagementSystem.Entity.Student;
import com.bisVivek.studentManagementSystem.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    //Add student
    @PostMapping
    public String addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return "Student added successfully!";
    }

    //Get all students
    @GetMapping
    public List<Student>getAllStudents(){
        return studentService.getAllStudents();
    }

    // Get a student by ID
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id) {
        return studentService.getStudentById(id);
    }
}
