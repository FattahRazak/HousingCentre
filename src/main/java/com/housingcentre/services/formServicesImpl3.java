package com.housingcentre.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.housingcentre.entities.Form3;
import com.housingcentre.repository.FormsRepository3;

@Service
public class formServicesImpl3 implements formServices3 {

	@Autowired
	private FormsRepository3 formsRepository3;

	public FormsRepository3 getFormsRepository3() {
		return formsRepository3;
	}

	public void setFormsRepository3(FormsRepository3 formsRepository3) {
		this.formsRepository3 = formsRepository3;
	}

	@Override
	public Iterable<Form3> findByKerjasendiri(String kerjasendiri) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Form3> getForm3(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
