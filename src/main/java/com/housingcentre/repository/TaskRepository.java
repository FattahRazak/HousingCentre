package com.housingcentre.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.housingcentre.entities.Task;
import com.housingcentre.entities.User;

public interface TaskRepository extends JpaRepository<Task, Long> {

	List<Task> findByUser(User user);

}
