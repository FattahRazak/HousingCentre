package com.housingcentre.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.housingcentre.entities.*;
import com.housingcentre.repository.FileRepository;



@Service
public class FileServicesImpl implements FileServices {

	@Autowired
	private FileRepository fileRepository;
	
	public FileRepository getFileRepository() {
		return fileRepository;
	}

	public void setFileRepository(FileRepository fileRepository) {
		this.fileRepository = fileRepository;
	}

	@Override
	public Iterable<FileModel> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<FileModel> findById(Long id){
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
