package com.example.tasklistapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tasklistapi.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    
}