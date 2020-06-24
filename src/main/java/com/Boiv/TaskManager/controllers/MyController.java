package com.Boiv.TaskManager.controllers;

import com.Boiv.TaskManager.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    // http://localhost:8525/app/index

    private TaskService taskService;

    @Autowired
    public void setTaskService(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/index")
    public String mainPage(){
        return "index";
    }
    @GetMapping("/writeText")
    public String addPage(){
        return "writeText";
    }
}
