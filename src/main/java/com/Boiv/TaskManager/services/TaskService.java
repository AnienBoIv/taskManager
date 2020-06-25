package com.Boiv.TaskManager.services;

import com.Boiv.TaskManager.entities.Text;
import com.Boiv.TaskManager.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private TaskRepository taskRepo;

    @Autowired
    public void setTaskRepo(TaskRepository taskRepo) {
        this.taskRepo = taskRepo;
    }

    public Text getTextById(int id) {
       return taskRepo.getTextList().get(id - 1);
    }

    public List<Text> getAllText() {
       return taskRepo.getTextList();
    }

    public void deleteTextById(int id) {
        taskRepo.deleteTextById(id);
    }
}
