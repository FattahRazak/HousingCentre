package com.housingcentre.services;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.housingcentre.entities.Role;
import com.housingcentre.entities.User;
import com.housingcentre.repository.RoleRepository;
import com.housingcentre.repository.UserRepository;

@Service
public class UserService implements UserDetailsService {
	
	private UserRepository userRepository;
	private RoleRepository roleRepository;

	@Autowired
	public UserService(UserRepository userRepository, RoleRepository roleRepository) {
		this.userRepository = userRepository;
		this.roleRepository = roleRepository;
	}
	
	public void creatUser(User user) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		user.setPassword(encoder.encode(user.getPassword()));
		
		
		Role userRole = roleRepository.findByName("ROLE_USER");
		if(userRole != null) {
			user.getRoles().add(userRole);
		}else {
			user.addRole("ROLE_USER");
		}
		
		
		userRepository.save(user);
	}
	
	
	
	public void creatAdmin(User user) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		user.setPassword(encoder.encode(user.getPassword()));
		Role userRole = new Role("ROLE_ADMIN");
		Set<Role> roles = new HashSet<>();
		roles.add(userRole);
		user.setRoles(roles);
		userRepository.save(user);
	}
	
	public User findOneUser(String ic) {
		
		return userRepository.findUserByIc(ic);
	}

	public boolean isUserPresent(String ic) {
		User u= userRepository.findUserByIc(ic);
		if (u!=null) {
			return true;
		}else return false;
	}

	public List<User> findAll() {
		
		return userRepository.findAll();
		
	}

	public List<User> findByName(String name) {
		return userRepository.findByNameLike("%"+name+"%");
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = userRepository.findUserByIc(username);
		
		if (user == null) {
			throw new UsernameNotFoundException(username);
		}
		System.out.println("MEGVAN "+user.getIc());
		return new UserDetailsImpl(user);
		
	}
	
	public User findByConfirmationToken(String confirmationToken) {
		return userRepository.findByConfirmationToken(confirmationToken);
	}

	public void saveUser(User user) {
		userRepository.save(user);
	}
	
	public User findUsersByEmail(String email) {
		return userRepository.findUsersByEmail(email);
	}
	
	public Optional<User> findUserByEmail(String email) {
		return userRepository.findUserByEmail(email);
	}
	
    public Optional<User> findUserByResetToken(String resetToken) {
		return userRepository.findByResetToken(resetToken);
	}

	public boolean checkIfValidOldPassword(User user, String oldPassword) {
		// TODO Auto-generated method stub
		return false;
	}

	public void changeUserPassword(User user, String password) {
		// TODO Auto-generated method stub
		
	}

}
