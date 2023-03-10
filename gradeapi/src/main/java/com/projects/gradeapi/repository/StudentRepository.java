package com.projects.gradeapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.projects.gradeapi.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

     
}
