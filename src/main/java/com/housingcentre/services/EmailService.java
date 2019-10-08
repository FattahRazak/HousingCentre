package com.housingcentre.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.housingcentre.entities.Task;
import com.housingcentre.entities.User;
import com.housingcentre.entities.ConfirmationToken;

@Service
public class EmailService {

	private JavaMailSender javaMailSender;

	private ConfirmationToken confirmationToken;
	
	private User user;
	
	
	@Autowired
	public EmailService(JavaMailSender javaMailSender) {
		this.javaMailSender=javaMailSender;
	}
	
	public void sendNotification(User user) {
		SimpleMailMessage mail = new SimpleMailMessage();
		
		mail.setTo(user.getEmail());
		mail.setFrom("${spring.mail.username}");
		mail.setSubject("Registration Successful");
		mail.setText("This email is sent to show you that you have registered an account in HousingCentre");
		
		javaMailSender.send(mail);
	}
	
	public void sendStatus(User user) {
		SimpleMailMessage status = new SimpleMailMessage();
		
		status.setTo(user.getEmail());
		status.setFrom("${spring.mail.username}");
		status.setSubject("Form Application Status");
		status.setText("Please login to your account at HousingCentre website and check the "
				+ "My Application Status navigation bar to check your housing application status that is updated by the admin.");
		
		javaMailSender.send(status);
	}
	
	public void sendForm(User user) {
		SimpleMailMessage form = new SimpleMailMessage();
		
		form.setTo("${spring.mail.username}");
		form.setFrom("${spring.mail.username}");
		form.setSubject("Housing Application");
		form.setText("Dear admin, a user named with ic number" + user.getIc() + "has applied for the national housing scheme.");
		
		javaMailSender.send(form);
	}

	public void sendForm2(User user) {
		SimpleMailMessage form2 = new SimpleMailMessage();
		
		form2.setTo(user.getEmail());
		form2.setFrom("${spring.mail.username}");
		form2.setSubject("Housing Application");
		form2.setText("Hello, there this mail is to inform you that you have applied for the national housing scheme through HousingCentre");
		
		javaMailSender.send(form2);
	}
	
	public void sendEmail(SimpleMailMessage email) {
	    javaMailSender.send(email);
	  }
}
