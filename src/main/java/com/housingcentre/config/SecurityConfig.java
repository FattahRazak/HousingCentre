package com.housingcentre.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.housingcentre.entities.*;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	UserDetailsService userService;
	
	@Autowired
	private DataSource dataSource;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.inMemoryAuthentication().withUser("admin")
										.password("pass")
										.roles("ADMIN");
		
		auth.userDetailsService(userService).passwordEncoder(passwordEncoder());
		
		
		/*auth.jdbcAuthentication().dataSource(dataSource)
		.usersByUsernameQuery("select id as principal, password as credentials, true from user where id=?")
		.authoritiesByUsernameQuery("select user_id as principal, role_id as role from user_roles where user_id=?")
		.passwordEncoder(passwordEncoder()).rolePrefix("ROLE_"); */
								
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		
		return new BCryptPasswordEncoder();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		
		http.authorizeRequests()
			.antMatchers("/register","/reg","/","/About","/login","/css/**","/webjars/**","/images/**", "/forgot-password","/reset","/confirm","/chat1").permitAll()
			.antMatchers("/db","/db/**").permitAll()
			.antMatchers("/admin").hasRole("ADMIN")
			.antMatchers("/users","/addStatus").hasRole("ADMIN")
		.anyRequest().authenticated()
		.and()
		.formLogin().loginPage("/login").permitAll().defaultSuccessUrl("/",true)
		.and()
		.logout().logoutSuccessUrl("/login")
		.deleteCookies("JSESSIONID");
	}

}
