	package com.housingcentre.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.housingcentre.entities.Task;
import com.housingcentre.entities.User;
import com.housingcentre.services.EmailService;
import com.housingcentre.services.TaskService;
import com.housingcentre.services.UserService;


//where admin assign task to user after submitting housing form
@Controller
public class TaskController {
	
	private TaskService taskService;
	private UserService userService;
	
	private Logger logger = LoggerFactory.getLogger(TaskController.class);
	
	@Autowired
	private EmailService emailService;
	
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Autowired
	public void setTaskService(TaskService taskService) {
		this.taskService = taskService;
	}
	
	@GetMapping("/addStatus")
	public String taskForm(String ic, Model model, HttpSession session) {
		
		session.setAttribute("ic", ic);
		model.addAttribute("task", new Task());
		
		
		return "views/StatusTaskForm";
	}
	
	@PostMapping("/addStatus")
	public String addTask( @Valid Task task, BindingResult bindingResult, HttpSession session) {
	
	if (bindingResult.hasErrors()) {
		return "views/StatusTaskForm";
	}
	
	String ic= (String)session.getAttribute("ic");
	taskService.addTask(task, userService.findOneUser(ic));
	
	
	
	return "redirect:/users";
	}
	
	
}
