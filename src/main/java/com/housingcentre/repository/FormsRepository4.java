package com.housingcentre.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.housingcentre.entities.Form4;

	@Component
	public interface FormsRepository4 
									extends CrudRepository<Form4, Integer>{
		List<Form4> findByMajikan3(String majikan3);

		Form4 findById(int id);
	}
	

