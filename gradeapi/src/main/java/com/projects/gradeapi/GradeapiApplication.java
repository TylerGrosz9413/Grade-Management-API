package com.projects.gradeapi;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.projects.gradeapi.entity.Course;
import com.projects.gradeapi.entity.Student;
import com.projects.gradeapi.repository.CourseRepository;
import com.projects.gradeapi.repository.GradeRepository;
import com.projects.gradeapi.repository.StudentRepository;

@SpringBootApplication

public class GradeapiApplication implements CommandLineRunner {

	@Autowired
	StudentRepository studentRepository;

	@Autowired
	GradeRepository gradeRepository;

	@Autowired
	CourseRepository courseRepository;

	public static void main(String[] args) {
		SpringApplication.run(GradeapiApplication.class, args);
	}

		@Override
		public void run(String...args) throws Exception {
			Student[] students = new Student[] {
				new Student("Jim Anderson", LocalDate.parse(("1999-07-31"))),
				new Student("Mike Johnson", LocalDate.parse(("1998-04-21"))),
				new Student("Ashley Smith", LocalDate.parse(("1998-10-07"))),
				new Student("Amy Wilson", LocalDate.parse(("1999-01-02")))
			};

			for (int i = 0; i < students.length; i++) {
				studentRepository.save(students[i]);
			}

			Course[] courses = new Course[] {
				new Course("Intro to Differential Equations", "MATH274", "In this class you will learn to solve differential equations, Laplace transforms, systems of equations, matrix methods, numerical techniques, and applications."),
				new Course("Intro to Abstract Mathematics", "MATH280", "In this class you will learn sets, symbolic logic, propositions, quantifiers, methods of proof, relations and functions."),
				new Course("Real Analysis", "MATH427", "In this class you will learn how to write rigorous mathematical proofs for various theorems in calculus."),
				new Course("Probability and Mathematical Statistics", "STAT412", "In this class you will learn how to apply concepts from multivariate calculus to problems in statistics."),
				new Course("Econometrics", "ECON403", "In this class you will learn various statistical techniques and methods and how they can be applied to economics."),
				new Course("Monetary Theory and Policy", "ECON462", "In this class you will analyze relationships among money, credit, employment, price stability, and national monetary policy.")
			};

			for (int i = 0; i < courses.length; i++) {
				courseRepository.save(courses[i]);
			}
		}
		
	}


