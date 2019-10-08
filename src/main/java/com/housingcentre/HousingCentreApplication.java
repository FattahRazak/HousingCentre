package com.housingcentre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@EntityScan(basePackages = "com.housingcentre.entities" )
@SpringBootApplication
public class HousingCentreApplication {

	public static void main(String[] args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

		SpringApplication.run(HousingCentreApplication.class, args);
		
	}
}
