package com.bisVivek.studentManagementSystem.Service;

import com.bisVivek.studentManagementSystem.Entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private final List<Student> students = new ArrayList<>();

    public void addStudent(Student student){
        students.add(student);
    }

    public List<Student> getAllStudents(){
        return students;
    }

    public Student getStudentById(int id){
        return students.stream()
                .filter(student -> student.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
