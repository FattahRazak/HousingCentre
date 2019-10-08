package com.housingcentre.controller;

import java.security.Principal;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.housingcentre.config.InvalidOldPasswordException;
import com.housingcentre.entities.GenericResponse;
import com.housingcentre.entities.Password;
import com.housingcentre.entities.User;
import com.housingcentre.services.EmailService;
import com.housingcentre.services.UserService;
import com.housingcentre.services.SecurityUserService;

public class ChangePassword {

	@Autowired
	private UserService userService;
	
	@Autowired
    private MessageSource messages;
	
	@Autowired
	private SecurityUserService securityUserService;
	
	@RequestMapping(value = "/changePassword", method = RequestMethod.GET)
    public String showChangePasswordPage(final Locale locale, final Model model, @RequestParam("id") final long id, @RequestParam("token") final String token) {
        final String result = securityUserService.validatePasswordResetToken(id, token);
        if (result != null) {
            model.addAttribute("message", messages.getMessage("auth.message." + result, null, locale));
            return "redirect:login?lang=" + locale.getLanguage();
        }
        return "redirect:Views/changePassword.html";
    }

    @RequestMapping(value = "/savePassword", method = RequestMethod.POST)
    @ResponseBody
    public GenericResponse savePassword(final Locale locale, @Valid Password password) {
        final User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        userService.changeUserPassword(user, password.getNewPassword());
        return new GenericResponse(messages.getMessage("message.resetPasswordSuc", null, locale));
    }
	
	
//	@RequestMapping(value="/changePassword", method = RequestMethod.GET)
//	public ModelAndView showChangePasswordPage(ModelAndView modelAndView, @RequestParam("token") String token) {
//			
//		User user = userService.findByConfirmationToken(token);
//			
//		if (user == null) { // No token found in DB
//			modelAndView.addObject("invalidToken", "Oops!  This is an invalid confirmation link.");
//		} else { // Token found
//			modelAndView.addObject("confirmationToken", user.getConfirmationToken());
//		}
//			
//		modelAndView.setViewName("views/changePassword");
//		return modelAndView;		
//	}
	
	@RequestMapping(value = "/changePassword", method = RequestMethod.POST)
	@PreAuthorize("hasRole('ROLE_USER')")
	@ResponseBody
	public GenericResponse changeUserPassword(ModelAndView modelAndView, Locale locale, 
	  @RequestParam("password") String password, 
	  @RequestParam("oldpassword") String oldPassword) throws InvalidOldPasswordException {
	    User user = userService.findUsersByEmail(
	      SecurityContextHolder.getContext().getAuthentication().getName());
	    modelAndView.setViewName("views/changePassword");
	    if (!userService.checkIfValidOldPassword(user, oldPassword)) {
	        throw new InvalidOldPasswordException();
	    }
	    userService.changeUserPassword(user, password);
	    return new GenericResponse(messages.getMessage("message.updatePasswordSuc", null, locale));
	}
	
}
