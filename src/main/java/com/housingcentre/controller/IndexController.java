package com.housingcentre.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("/")
	public String index() {
		
		return "index";
	}
	
	@RequestMapping("/login")
	public String showLoginForm() {
		
		return "views/loginForm";
	}
	
	@RequestMapping("/About")
	public String showAboutPage() {
		
		return "views/About";
	}

}
