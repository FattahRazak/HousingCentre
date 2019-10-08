package com.housingcentre.services;

import java.util.Optional;

import com.housingcentre.entities.FileModel;

public interface FileServices {

	Iterable<FileModel> findByName(String name);
	
	public Optional<FileModel> findById(Long id); 
	
}
