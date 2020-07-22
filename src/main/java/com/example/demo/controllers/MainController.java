package com.example.demo.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import javax.servlet.http.HttpServletRequest;

@Controller
public class MainController {

    @GetMapping
    public String main(Model model, HttpServletRequest request)
    {
        model.addAttribute("address", request.getRemoteAddr());
        return "main";
    }
}