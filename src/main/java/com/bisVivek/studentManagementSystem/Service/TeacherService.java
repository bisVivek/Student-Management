package com.bisVivek.studentManagementSystem.Service;

import com.bisVivek.studentManagementSystem.Entity.Teacher;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherService {

    private final List<Teacher> teachers= new ArrayList<>();

    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }

    public List<Teacher>getAllTeachers(){
        return teachers;
    }

    public Teacher getTeacherById(int id){
        return teachers.stream()
                .filter(teacher -> teacher.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
