package com.housingcentre.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.housingcentre.entities.Form;


@Component
public interface FormsRepository 
								extends CrudRepository<Form, Integer>{
	List<Form> findByName(String name);

	Form findById(int id);
}
