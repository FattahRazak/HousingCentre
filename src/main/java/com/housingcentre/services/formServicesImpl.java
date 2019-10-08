package com.housingcentre.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.housingcentre.entities.*;
import com.housingcentre.repository.FormsRepository;

@Service
public class formServicesImpl implements formServices {

	@Autowired
	private FormsRepository formsRepository;

	public FormsRepository getFormsRepository() {
		return formsRepository;
	}

	public void setFormsRepository(FormsRepository formsRepository) {
		this.formsRepository = formsRepository;
	}

	@Override
	public Iterable<Form> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Form> getForm(int id) {
		// TODO Auto-generated method stub
		return null;
	}


}
