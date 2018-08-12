package com.uipath.viewmodels;

import org.springframework.data.repository.CrudRepository;

import com.uipath.models.Task;

public interface TaskRepository extends CrudRepository<Task, String>{
	
	// CRUD operations - outOfThebox
	// getAllTopics
	// getTopic
	// updateTopic
	// deleteTopic

	 
}
