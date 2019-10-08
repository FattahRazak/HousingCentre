package com.housingcentre.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class AboutController {
	@RequestMapping("/about")
	public String about() {
		
		return "about";
	}
//	
//	@RequestMapping("/login")
//	public String showLoginForm() {
//		
//		return "views/loginForm";
//	}

}
