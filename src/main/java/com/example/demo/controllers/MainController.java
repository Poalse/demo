package com.example.demo.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    private AppName appName;

    @Autowired
    public void setAppName(AppName appName) {
        this.appName = appName;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", appName.name);
        return "home";
    }

}