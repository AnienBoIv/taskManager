package com.Boiv.TaskManager.services;

import com.Boiv.TaskManager.entities.Text;
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

    public Text getTextById(Long id) {
       return taskRepo.getOne(id);
    }

    public List<Text> getAllText() {
       return taskRepo.findAll();
    }

    public void deleteTextById(Long id) {
        taskRepo.deleteById(id);
    }

    public void addTask(Text text_task) {
        taskRepo.save(text_task);
    }

    public void updateTask(Text task) {
        taskRepo.save(task);
    }
}
