package com.housingcentre.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChatController2 {

	@RequestMapping("/chat1")
	public String chat () {
		
		return "views/chat1";
		
	}
	
}
