package com.housingcentre.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.housingcentre.entities.FileModel;

@Transactional
public interface FileRepository extends JpaRepository<FileModel, Long> {

	public FileModel findByName(String name);

	public Optional<FileModel> findById(Long id);
	
}
