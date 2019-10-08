package com.housingcentre.entities;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.security.RolesAllowed;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class User {

	@Id
	@GeneratedValue
	private Long id;
	@Email
	@NotEmpty
	@Column(unique = true)
    @Pattern(regexp = "^(.+)@(.+)$", message = "Email must contain @ and .etc")
	private String email;
	@NotEmpty
    @Pattern(regexp = "^([a-zA-Z]+\\s*)*$+$", message = "Only Alphabets are allowed e.g Abu Yusof")
	private String name;
	@NotEmpty
	@Column(unique = true)
	@Pattern(regexp = "[0-1]{2}-[0-9]{6}", message = "Must follow the format e.g 01-000000")
	private String ic;
	
	@Pattern(regexp = "^(?=\\P{Ll}*\\p{Ll})(?=\\P{Lu}*\\p{Lu})(?=\\P{N}*\\p{N})(?=[\\p{L}\\p{N}]*[^\\p{L}\\p{N}])[\\s\\S]{8,}$", message = "Password should contain atleast 8 characters with minimum 1 uppercase and lowercase,"
            + " one digit and a special character.")
	private String password;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private List<Task> tasks;
	
	@Column(name = "confirmation_token")
	private String confirmationToken;
	
	@Column(name = "reset_token")
	private String resetToken;
	
	@Column(name = "enabled")
	private boolean enabled;
   
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "USER_ROLES", joinColumns={
			@JoinColumn(name = "user_id") }, inverseJoinColumns = {
					@JoinColumn(name = "role_id") })
	private Set<Role> roles = new HashSet<>();
	
	

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIc() {
		return ic;
	}

	public void setIc(String ic) {
		this.ic = ic;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Task> gettasks() {
		return tasks;
	}

	public void settasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	
	public void addRole(String roleName) {
		if (this.roles == null || this.roles.isEmpty()) {
			this.roles = new HashSet<>();
		}
		this.roles.add(new Role(roleName));
	}

	public User(Long id,String email, String name, String password, String ic, String confirmationToken, String resetToken) {
		this.id=id;
		this.email = email;
		this.name = name;
		this.ic = ic;
		this.password = password;
		this.confirmationToken = confirmationToken;
		this.resetToken = resetToken;
	}
	
	public User(String email, String name, String password, String ic, String confirmationToken, String resetToken) {
		this.email = email;
		this.name = name;
		this.ic = ic;
		this.password = password;
		this.confirmationToken = confirmationToken;
		this.resetToken = resetToken;
	}

	public User() {

	}
	
	public String getConfirmationToken() {
		return confirmationToken;
	}

	public void setConfirmationToken(String confirmationToken) {
		this.confirmationToken = confirmationToken;
	}

	public String getResetToken() {
		return resetToken;
	}

	public void setResetToken(String resetToken) {
		this.resetToken = resetToken;
	}
	public boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(boolean value) {
		this.enabled = value;
	}


}