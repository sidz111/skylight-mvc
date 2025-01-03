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
		User u = new User();
		u.setId(1);
		u.setName("Siddhu");
		u.setAddress("Jalgaon");
		
		User u2 = new User();
		u2.setId(2);
		u2.setName("Akash");
		u2.setAddress("Pune");
		
		User u3 = new User();
		u3.setId(3);
		u3.setName("Dipesh");
		u3.setAddress("MP");
		
		List<User> list = new ArrayList<>();
		list.add(u);
		list.add(u2);
		list.add(u3);
		
		model.addAttribute("list", list);
		return "index";
	}

}
