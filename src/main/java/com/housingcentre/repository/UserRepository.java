package com.housingcentre.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.housingcentre.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findUserById(Long id);
	
	User findUserByIc(String ic);
	
	List<User> findAll();

	List<User> findByNameLike(String name);
	
	public User findUsersByEmail(String email);

	public Optional<User> findUserByEmail(String email);

	public Optional<User> findByResetToken(String resetToken);

	User findByConfirmationToken(String confirmationToken);
	
}
