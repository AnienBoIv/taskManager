package com.Boiv.TaskManager.repositories;

import com.Boiv.TaskManager.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TextRepository extends JpaRepository<Task, Long> {
}
