package com.housingcentre.controller;
import java.security.Principal;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.housingcentre.entities.User;
import com.housingcentre.services.EmailService;
import com.housingcentre.services.UserService;

@Controller
public class LoginController {
	

	@Autowired
	private UserService userService;
	
	@Autowired
	private EmailService emailService;
	
	// Instantiate our encoder
    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    // Right before saving the user on registration, we encode the password

	
    @RequestMapping(value="/login", method=RequestMethod.GET)
    public String login(Principal principal) {
        return principal == null ?  "views/loginForm" : "redirect:/"; 
    }
    
 // Display forgotPassword page
  	@RequestMapping(value = "/forgot-password", method = RequestMethod.GET)
  	public ModelAndView displayForgotPasswordPage(ModelAndView modelAndView, User user) {
  		modelAndView.addObject("user", user);
 		modelAndView.setViewName("Views/forgotPassword");
 		return modelAndView;
      }
      
      // Process form submission from forgotPassword page
  	@RequestMapping(value = "/forgot-password", method = RequestMethod.POST)
  	public ModelAndView processForgotPasswordForm(ModelAndView modelAndView, @RequestParam("email") String email, HttpServletRequest request, User user) {
  		
  		// Lookup user in database by e-mail
  		Optional<User> optional = userService.findUserByEmail(email);

  		if (!optional.isPresent()) {
  			modelAndView.addObject("errorMessage", "We didn't find an account for that e-mail address.");
  		} else {
  			
  			// Generate random 36-character string token for reset password 
  			User users = optional.get();
  			users.setResetToken(UUID.randomUUID().toString());

  			// Save token to database
  			userService.saveUser(users);

  			String appUrl = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort();
  			
  			// Email message
  			SimpleMailMessage passwordResetEmail = new SimpleMailMessage();
  			passwordResetEmail.setFrom("${spring.mail.username}");
  			passwordResetEmail.setTo(user.getEmail());
  			passwordResetEmail.setSubject("Password Reset Request");
  			passwordResetEmail.setText("To reset your password, click the link below:\n" + appUrl
  					+ "/reset?token=" + users.getResetToken());
  			
  			emailService.sendEmail(passwordResetEmail);

  			// Add success message to view
  			modelAndView.addObject("successMessage", "A password reset link has been sent to " + email);
  		}

  		modelAndView.setViewName("views/forgotPassword");
  		return modelAndView;

  	}

  // Display form to reset password

  	@RequestMapping(value = "/reset", method = RequestMethod.GET)
  	public ModelAndView displayResetPasswordPage(ModelAndView modelAndView, @RequestParam("token") String token) {
  		
  		Optional<User> user = userService.findUserByResetToken(token);

  		if (user.isPresent()) { // Token found in DB
  			modelAndView.addObject("resetToken", token);
  		} else { // Token not found in DB
  			modelAndView.addObject("errorMessage", "Oops!  This is an invalid password reset link.");
  		}

  		modelAndView.setViewName("views/resetPassword");
  		return modelAndView;
  	}

  	// Process reset password form
  	@RequestMapping(value = "/reset", method = RequestMethod.POST)
  	public ModelAndView setNewPassword(ModelAndView modelAndView, @RequestParam Map<String, String> requestParams, RedirectAttributes redir, BindingResult bindingResult) {

  		// Find the user associated with the reset token
  		Optional<User> user = userService.findUserByResetToken( requestParams.get("token"));

  		// This should always be non-null but we check just in case
  		if (user.isPresent()) {
  			
  			User resetUser = user.get(); 
              
  			// Set new password    
              user.get().setPassword (encoder.encode(requestParams.get("password")));
              
  			// Set the reset token to null so it cannot be used again
  			resetUser.setResetToken(null);

  			// Save user
  			userService.saveUser(resetUser);

  			// In order to set a model attribute on a redirect, we must use
  			// RedirectAttributes
  			redir.addFlashAttribute("successMessage", "You have successfully reset your password.  You may now login.");

  			modelAndView.setViewName("redirect:login");
  			return modelAndView;
  			
  		} else {
  			modelAndView.addObject("errorMessage", "Oops!  This is an invalid password reset link.");
  			modelAndView.setViewName("views/resetPassword");	
  		}
  		
  		return modelAndView;
     }
     
      // Going to reset page without a token redirects to login page
  	@ExceptionHandler(MissingServletRequestParameterException.class)
  	public ModelAndView handleMissingParams(MissingServletRequestParameterException ex) {
  		return new ModelAndView("redirect:login");
  	}
    


    

    



}