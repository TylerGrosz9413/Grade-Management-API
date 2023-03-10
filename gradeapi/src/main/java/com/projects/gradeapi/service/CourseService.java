package com.projects.gradeapi.service;

import java.util.List;

import com.projects.gradeapi.entity.Course;

public interface CourseService {

    Course getCourse(Long id);
    Course saveCourse(Course course);
    void deleteCourse(Long id);
    List<Course> getCourses();
    
}
