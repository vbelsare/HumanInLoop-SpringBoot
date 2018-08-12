package com.uipath.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uipath.models.Task;
import com.uipath.viewmodels.TaskRepository;

@Service
public class TaskService {
	
	@Autowired
	private TaskRepository taskRepository;
	
	public List<Task> getAllTasks() {
		List<Task> tasks = new ArrayList<Task>();
		taskRepository.findAll().forEach(tasks::add);
		return tasks;
	}

	public Task getTask(String id) {
		return taskRepository.findOne(id);
	}
	
	
	public void addTask(Task task) {
		taskRepository.save(task);
	}
	
	public void updateTask(Task task, String id) {
		taskRepository.save(task);
	}
	
	public void deleteTask(Task task, String id) {
		taskRepository.delete(id);
	}
}
