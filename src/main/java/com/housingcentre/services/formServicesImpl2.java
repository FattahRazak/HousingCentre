package com.housingcentre.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.housingcentre.entities.Form2;
import com.housingcentre.repository.FormsRepository2;

@Service
public class formServicesImpl2 implements formServices2 {

	@Autowired
	private FormsRepository2 formsRepository2;

	public FormsRepository2 getFormsRepository2() {
		return formsRepository2;
	}

	public void setFormsRepository2(FormsRepository2 formsRepository2) {
		this.formsRepository2 = formsRepository2;
	}

	@Override
	public Iterable<Form2> findByAddress3(String address3) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Form2> getForm2(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
