package com.housingcentre.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.housingcentre.entities.Form2;

@Component
public interface FormsRepository2 
									extends CrudRepository<Form2, Integer>{
		List<Form2> findByAddress3(String address3);

		Form2 findById(int id);
	}
	

