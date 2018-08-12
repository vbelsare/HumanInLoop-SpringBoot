package com.uipath.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.uipath.models.Task;
import com.uipath.services.TaskService;

@RestController
public class TaskController {
	
	@Autowired
	private TaskService taskService;
	
	@RequestMapping("/tasks")
	public List<Task> getAllTasks() {
		return taskService.getAllTasks();
	}

	@RequestMapping("/tasks/{taskId}")
	public Task getTask(@PathVariable("taskId") String id) {
		return taskService.getTask(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/tasks")
	public void addTask(@RequestBody Task task) {
		taskService.addTask(task);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/tasks/{taskId}")
	public void updateTask(@RequestBody Task task, @PathVariable String taskId) {
		taskService.updateTask(task,taskId);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/tasks/{taskId}")
	public void deleteTask(@RequestBody Task task, @PathVariable String taskId) {
		taskService.deleteTask(task,taskId);
	}
}
