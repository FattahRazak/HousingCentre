package com.housingcentre.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.housingcentre.entities.Form5;

	@Component
	public interface FormsRepository5 
									extends CrudRepository<Form5, Integer>{
		List<Form5> findByJawatan6(String jawatan6);

		Form5 findById(int id);
	
	
}
