package com.housingcentre.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.housingcentre.entities.Form4;
import com.housingcentre.repository.FormsRepository4;

@Service
public class formServicesImpl4 implements formServices4 {

	@Autowired
	private FormsRepository4 formsRepository4;

	public FormsRepository4 getFormsRepository4() {
		return formsRepository4;
	}

	public void setFormsRepository4(FormsRepository4 formsRepository4) {
		this.formsRepository4 = formsRepository4;
	}

	@Override
	public Iterable<Form4> findByMajikan3(String majikan3) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Form4> getForm4(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
