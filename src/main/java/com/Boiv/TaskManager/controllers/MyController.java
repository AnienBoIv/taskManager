package com.Boiv.TaskManager.controllers;

import com.Boiv.TaskManager.entities.Task;
import com.Boiv.TaskManager.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MyController {

    private TaskService taskServ;

    @Autowired
    public void setTaskService(TaskService taskService) {
        this.taskServ = taskService;
    }

// The main page with the task table
    @GetMapping("/index")
    public String mainTaskPage(Model model) {
        List<Task> allTask = taskServ.getAllTask();
        model.addAttribute("taskList", allTask);
        return "index";
    }

// Page with writing the task
    @GetMapping("/writeTask")
    public String addTaskPage() {
        return "writeTask";
    }
// Action to add a task
    @PostMapping("/writeTask/addTask")
    public String fieldWrite( @ModelAttribute("addTaskField") String goalTask ){
        Task task = new Task(goalTask);
        taskServ.addTask(task);
        return "redirect:/index";
    }

// Page with changing the task
    @GetMapping("/changeTask/{id}")
    public String changeTaskPage(Model model, @PathVariable("id") Long id) {
        Task selectOneTask = taskServ.getTaskById(id);
        model.addAttribute("taskById", selectOneTask);
        return "changeTask";
    }
// Action to change a task
    @PostMapping("/changeTask/{id}/changeText")
    public String updateCurrentTask(@ModelAttribute("taskChangeField") String changedGoalTask, @PathVariable("id") Long id) {
        Task changedTask = new Task(id, changedGoalTask);
        taskServ.updateTask(changedTask);
        return "redirect:/index";
    }

// Action to delete a task
    @GetMapping("/taskDelete/{id}")
    public String deleteTextById(@PathVariable("id") Long id) {
        taskServ.deleteTaskById(id);
        return "redirect:/index";
    }
}
