package com.Boiv.TaskManager.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    // http://localhost:8525/app/index

    @GetMapping("/index")
    public String mainPage(){
        return "index";
    }
    @GetMapping("/writeText")
    public String addPage(){
        return "writeText";
    }
}
