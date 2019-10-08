package com.housingcentre.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.housingcentre.entities.Task;
import com.housingcentre.entities.User;
import com.housingcentre.repository.TaskRepository;

@Service
public class TaskService{
	
	private TaskRepository taskRepository;
	
	@Autowired
	private EmailService emailService;

	@Autowired
	public TaskService(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}
	
	public void addTask(Task task, User user) {
		task.setUser(user);
		taskRepository.save(task);
		emailService.sendStatus(user);
	}
	
	public List<Task> findUserTask(User user){
		
		return taskRepository.findByUser(user);
		
	}
	
	

}
