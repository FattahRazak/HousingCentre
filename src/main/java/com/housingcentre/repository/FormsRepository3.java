package com.housingcentre.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.housingcentre.entities.Form3;

	@Component
	public interface FormsRepository3
									extends CrudRepository<Form3, Integer>{
		List<Form3> findByKerjasendiri(String kerjasendiri);

		Form3 findById(int id);
	}
	

