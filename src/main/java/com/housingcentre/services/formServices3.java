package com.housingcentre.services;

import com.housingcentre.entities.Form3;

public interface formServices3 {

	Iterable<Form3> findByKerjasendiri(String kerjasendiri);
	
	public Iterable<Form3> getForm3(int id); 
	
}
