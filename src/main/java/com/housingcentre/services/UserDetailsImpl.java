package com.housingcentre.services;

import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.housingcentre.entities.Role;
import com.housingcentre.entities.User;
import com.housingcentre.repository.UserRepository;
import com.housingcentre.services.UserService;

public class UserDetailsImpl implements UserDetails{
	
	private User user;
	
	private UserRepository userRepository;
	
	private UserService userService;
	
	
	@Autowired
	public UserDetailsImpl(User user) {
		this.user=user;
	}


	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		Collection<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
		Set<Role> roles = user.getRoles();
		
		for( Role role : roles) {
			authorities.add(new SimpleGrantedAuthority(role.getName()));
			
		}
		return authorities;
	}
	

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		System.out.println("PW: "+user.getPassword());
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return user.getIc();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	public void save(User user) {
		userRepository.save(user);
	}
	
	
	public  Optional<User> findUserByEmail(String email) {
		return userRepository.findUserByEmail(email);
	}


	public Optional<User> findUserByResetToken(String resetToken) {
		return userService.findUserByResetToken(resetToken);
	}
}
