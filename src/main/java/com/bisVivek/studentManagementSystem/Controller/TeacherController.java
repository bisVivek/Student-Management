package com.bisVivek.studentManagementSystem.Controller;

import com.bisVivek.studentManagementSystem.Entity.Teacher;
import com.bisVivek.studentManagementSystem.Service.TeacherService;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @PostMapping
    public String addTeacher(@RequestBody Teacher teacher){
        teacherService.addTeacher(teacher);
        return "Teacher added successfully";
    }

    @GetMapping
    public List<Teacher> getAllTeachers (){
        return teacherService.getAllTeachers();
    }

    @GetMapping("/id")
    public Teacher getTeacherById(@PathVariable int id){
        return teacherService.getTeacherById(id);
    }
}
