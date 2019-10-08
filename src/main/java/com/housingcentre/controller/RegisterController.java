package com.housingcentre.controller;

import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.housingcentre.entities.User;
import com.housingcentre.services.EmailService;
import com.housingcentre.services.UserService;

@Controller
public class RegisterController {
	
	UserService userService;
	
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	private Logger logger = LoggerFactory.getLogger(RegisterController.class);
	
	@Autowired
	private EmailService emailService;


	@RequestMapping("/register")
	public String registerForm(Model model) {
	
		model.addAttribute("user", new User());
		return "views/registerForm";
	}
	
	@PostMapping("/reg")
		public String registerUser(@Valid User user, BindingResult bindingResult, Model model, HttpServletRequest request) {
			if (bindingResult.hasErrors()){
				return "views/registerForm";
			}
		
		if(userService.isUserPresent(user.getIc()))	{
			model.addAttribute("exist",true);
			return "views/registerForm";
		}
		userService.creatUser(user);
		
		user.setEnabled(false);
		
		
		user.setConfirmationToken(UUID.randomUUID().toString());
		userService.saveUser(user);
		 
		 String appUrl = request.getScheme() + "://" + request.getServerName() + ":"+ request.getServerPort();
		 String usrname = user.getName();
		 
		 SimpleMailMessage registrationEmail = new SimpleMailMessage();
			registrationEmail.setTo(user.getEmail());
			registrationEmail.setSubject("Registration Confirmation");
			registrationEmail.setText("السَّلَامُ عَلَيكُمْ وَرَحمَةُ اللهِ وَبَرَكَاتُهُ"+"\n"+"Good Afternoon "+ usrname + 
					", \n\n"+"You have successfully created an account for Housing centre, \n" +"To confirm your e-mail address, please click the link below:\n"
					+ appUrl + "/confirm?token=" + user.getConfirmationToken() +"\n\n "+ "If you did not create this account, \n" +"Please ignore and delete this email." +"\n \n\n\n" + "Best Regards, \n");
			registrationEmail.setFrom("${spring.mail.username}");
		
		try {
			emailService.sendEmail(registrationEmail);
		}
		catch(MailException e) {
			logger.info("Error sending mail" + e.getMessage());
		}
			
		return "views/success";
		}
	
	
	@RequestMapping(value="/confirm", method = RequestMethod.GET)
	public ModelAndView showConfirmationPage(ModelAndView modelAndView, @RequestParam("token") String token) {
			
		User user = userService.findByConfirmationToken(token);
			
		if (user == null) { // No token found in DB
			modelAndView.addObject("invalidToken", "Oops!  This is an invalid confirmation link.");
		} else { // Token found
			modelAndView.addObject("confirmationToken", user.getConfirmationToken());
		}
			
		modelAndView.setViewName("views/confirm");
		return modelAndView;		
	}
	// Process confirmation link
		@RequestMapping(value="/confirm", method = RequestMethod.POST)
		public ModelAndView processConfirmationForm(ModelAndView modelAndView, BindingResult bindingResult, @RequestParam Map requestParams, RedirectAttributes redir) {
						
			modelAndView.setViewName("views/confirm");
				

			// Find the user associated with the reset token
			User user = userService.findByConfirmationToken((String) requestParams.get("token"));


			// Set user to enabled
			user.setEnabled(true);
				
			// Save user
			userService.saveUser(user);
				
			modelAndView.addObject("successMessage", "Your password has been set!");
			return new ModelAndView("redirect:login");		

		
		}

}
