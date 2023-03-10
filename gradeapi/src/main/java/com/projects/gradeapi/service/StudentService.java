package com.projects.gradeapi.service;

import java.util.List;

import com.projects.gradeapi.entity.Student;

public interface StudentService {

    Student getStudent(Long id);
    Student saveStudent(Student student);
    void deleteStudent(Long id);
    List<Student> getStudents();
    
}
