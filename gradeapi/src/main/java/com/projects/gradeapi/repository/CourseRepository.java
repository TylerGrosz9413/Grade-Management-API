package com.projects.gradeapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.projects.gradeapi.entity.Course;

public interface CourseRepository extends CrudRepository<Course, Long> {
    
}
