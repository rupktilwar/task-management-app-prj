package com.example.coderByte.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.coderByte.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}

