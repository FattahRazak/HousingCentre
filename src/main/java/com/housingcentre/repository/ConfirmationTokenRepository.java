package com.housingcentre.repository;

import org.springframework.data.repository.CrudRepository;

import com.housingcentre.entities.ConfirmationToken;


public interface ConfirmationTokenRepository extends CrudRepository<ConfirmationToken, String>{
	ConfirmationToken findByConfirmationToken(String confirmationToken);
}
