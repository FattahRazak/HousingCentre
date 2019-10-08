package com.housingcentre.services;

public interface SecurityUserService {

	String validatePasswordResetToken(long id, String token);
	
}
