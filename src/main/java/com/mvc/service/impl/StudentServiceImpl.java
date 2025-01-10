package com.mvc.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.entities.Student;
import com.mvc.repository.StudentRepository;
import com.mvc.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentRepository studentRepository;

	@Override
	public Student addStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		Optional<Student> s = studentRepository.findById(student.getId());
		if(s.isEmpty()) {
			return null;
		}
		else {
			return studentRepository.save(student);
		}
	}

	@Override
	public void removeStudentById(Integer id) {
		studentRepository.deleteById(id);
	}

	@Override
	public Student getUserById(Integer id) {
		Optional<Student> student = studentRepository.findById(id);
		if(student.isEmpty()) {
			return null;
		}
		else {
			return student.get();
		}
	}

	@Override
	public List<Student> getAllStudents() {
		return this.studentRepository.findAll();
	}

}
