package com.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String homePage(Model model) {
		User u = new User(1, "Siddhu", "MH");
		User u2 = new User(2, "Akash", "Pune");
		User u3 = new User(3, "Deepesh", "Mp");
		
		List<User> list = new ArrayList<>();
		list.add(u);
		list.add(u2);
		list.add(u3);
		
		Employee e1 = new Employee(1, "Ganesh", 12355432l);
		Employee e2 = new Employee(2, "Chandragupta", 35465665l);
		Employee e3 = new Employee(3, "Siddharth", 54575676l);
		Employee e4 = new Employee(4, "Gautam", 68686766l);
		
		List<Employee> empList = new ArrayList<>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		
		Hospital h1 = new Hospital(1, "Moraya Clinic", "Nashik", "09:30 AM");
		Hospital h2 = new Hospital(2, "Surya Clinic", "Bihar", "08:30 AM");
		Hospital h3 = new Hospital(3, "Pardeshi Clinic", "Mp", "07:30 AM");
		
		List<Hospital> h_list = new ArrayList<>();
		h_list.add(h1);
		h_list.add(h2);
		h_list.add(h3);
		
		model.addAttribute("list", list);
		model.addAttribute("eList", empList);
		model.addAttribute("hospitals", h_list);
		return "index";
	}

}
