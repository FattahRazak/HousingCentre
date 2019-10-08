package com.housingcentre.services;

import com.housingcentre.entities.Form;

public interface formServices {

	Iterable<Form> findByName(String name);
	
	public Iterable<Form> getForm(int id); 

}


