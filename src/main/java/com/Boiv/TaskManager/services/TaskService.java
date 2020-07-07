package com.Boiv.TaskManager.services;

import com.Boiv.TaskManager.entities.Task;
import com.Boiv.TaskManager.repositories.TextRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private TextRepository taskRepo;

    @Autowired
    public void setTaskRepo(TextRepository taskRepo) {
        this.taskRepo = taskRepo;
    }

    public Task getTaskById(Long id) {
       return taskRepo.getOne(id);
    }

    public List<Task> getAllTask() {
       return taskRepo.findAll();
    }

    public void deleteTaskById(Long id) {
        taskRepo.deleteById(id);
    }

    public void addTask(Task task) {
        taskRepo.save(task);
    }

    public void updateTask(Task task) {
        taskRepo.save(task);
    }
}
