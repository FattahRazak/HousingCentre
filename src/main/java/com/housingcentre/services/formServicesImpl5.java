package com.housingcentre.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.housingcentre.entities.Form5;
import com.housingcentre.repository.FormsRepository5;

@Service
public class formServicesImpl5 implements formServices5 {

	@Autowired
	private FormsRepository5 formsRepository5;

	public FormsRepository5 getFormsRepository5() {
		return formsRepository5;
	}

	public void setFormsRepository5(FormsRepository5 formsRepository5) {
		this.formsRepository5 = formsRepository5;
	}

	@Override
	public Iterable<Form5> findByJawatan6(String jawatan6) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Form5> getForm5(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
