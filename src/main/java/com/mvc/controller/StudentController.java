package com.mvc.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mvc.entities.Student;
import com.mvc.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping("/")
	public String getHomePage(Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		return "index";
	}
	
	@GetMapping("/add-student")
	public String getAddStudent() {
		return "add-student";
	}

	
	@PostMapping("/add")
	public String addStudent(
			@RequestParam("name") String name,
			@RequestParam("email") String email,
			@RequestParam("age") Integer age,
			@RequestParam("mobile_no") String mobile_no,
			@RequestParam("address") String address,
			@RequestParam("school_name") String school_name,
			@RequestParam("marks") String marks,
			RedirectAttributes redirectAttributes
			) {
		Student s = new Student(name, email, age, mobile_no, address, school_name, Double.parseDouble(marks));
		studentService.addStudent(s);
		return "redirect:/";
	}
	
	@GetMapping("/remove/{id}")
	public String removeStudent(@PathVariable("id") Integer id, Model model) {
		Optional<Student> s = Optional.ofNullable(studentService.getUserById(id));
		if(s.isEmpty()) {
			model.addAttribute("message", "Student not found");
			return "response";
		}
		else {
			studentService.removeStudentById(id);
			model.addAttribute("message", "Student "+s.get().getName()+" is successfully deleted");
			return "index";			
		}
	}

}
