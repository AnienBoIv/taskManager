package com.Boiv.TaskManager.controllers;

import com.Boiv.TaskManager.entities.Text;
import com.Boiv.TaskManager.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MyController {
    // http://localhost:8525/app/index

    private TaskService taskServ;

    @Autowired
    public void setTaskService(TaskService taskService) {
        this.taskServ = taskService;
    }

    /*@GetMapping("/index/{id}")
    public String mainPage(Model model, @PathVariable("id") int id) {
        Text someText = taskServ.getTextById(id);
        model.addAttribute("sometxt", someText);
        return "index";
    }*/

// Main page with table
    @GetMapping("/index")
    public String mainTaskPage(Model model) {
        List<Text> allText = taskServ.getAllText();
        model.addAttribute("sometxt", allText );
        return "index";
}

// Page with writing the task
    @GetMapping("/writeText")
    public String addTaskPage() {
        return "writeText";
    }
// Action for add a new task
    @PostMapping("/writeText/addTask")
    public String fieldWrite( @ModelAttribute("text_task") String text_task ){
        Text task = new Text(text_task);
        taskServ.addTask(task);
        return "redirect:/index";
    }

//    @PostMapping("/writeText/addTask")
//    public String testField(Model model, @RequestParam String text_task){
//        Text task = new Text(text_task);
//        taskServ.addTask(task);
//        return "redirect:/index";
//    }

// Page with changing the task
    @GetMapping("/changeText/{id}")
    public String changeTaskPage(Model model, @PathVariable("id") Long id) {
        Text someText = taskServ.getTextById(id);
        model.addAttribute("sometxt", someText);
        return "changeText";
    }
// Action for changing task
    @PostMapping("/changeText/{id}/changeTask")
    public String updateCurrentTask(@ModelAttribute("changed_task") String changed_task, @PathVariable("id") Long id) {
        Text changedTask = new Text(id, changed_task);
        taskServ.updateTask(changedTask);
        return "redirect:/index";
    }

// Button for delete task from table
    @GetMapping("/textDelete/{id}")
    public String deleteTextById(@PathVariable("id") Long id) {
        taskServ.deleteTextById(id);
        return "redirect:/index";
    }
}
