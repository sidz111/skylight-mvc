package com.mvc.service;

import java.util.List;

import com.mvc.entities.Student;

public interface StudentService {
	// insert
	Student addStudent(Student student);
	
	// update
	Student updateStudent(Student student);
	
	// delete
	void removeStudentById(Integer id);
	
	// read
	Student getUserById(Integer id);
	
	List<Student> getAllStudents();
}
