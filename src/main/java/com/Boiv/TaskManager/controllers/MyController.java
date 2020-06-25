package com.Boiv.TaskManager.controllers;

import com.Boiv.TaskManager.entities.Text;
import com.Boiv.TaskManager.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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

    @GetMapping("/index")
    public String mainPage(Model model) {
        List<Text> allText = taskServ.getAllText();
        model.addAttribute("sometxt", allText);
        return "index";
    }

    @GetMapping("/writeText")
    public String addPage() {
        return "writeText";
    }

    @GetMapping("/changeText/{id}")
    public String changePage(Model model, @PathVariable("id") int id) {
        Text someText = taskServ.getTextById(id);
        model.addAttribute("sometxt", someText);
        return "changeText";
    }

    @GetMapping("text/textDelete/{id}")
    public String deleteTextById(@PathVariable("id") int id) {
        taskServ.deleteTextById(id);
        return "redirect:/index";
    }
}
