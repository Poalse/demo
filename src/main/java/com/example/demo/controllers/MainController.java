package com.example.demo.controllers;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


import javax.servlet.http.HttpServletRequest;

@Controller
public class MainController {

    @GetMapping
    public String main(Model model, HttpServletRequest r)
    {
        model.addAttribute("address",  String.format("remote addr %s, port %d, user %s, host %s\n"
                        + "local addr %s, port %d, name %s",
                r.getRemoteAddr(), r.getRemotePort(), r.getRemoteUser(), r.getRemoteHost(),
                r.getLocalAddr(), r.getLocalPort(), r.getLocalName()));
        return "main";
    }


    @GetMapping("/ping")
    public String ping(Model model) {
        model.addAttribute("request", "ping");
        model.addAttribute("type", "Наш запрос");
        return "requests";
    }

    @GetMapping("/subscribe")
    public String subscribe(Model model) {
        model.addAttribute("request", "subscribe");
        model.addAttribute("type", "Наш запрос");
        return "requests";
    }

    @GetMapping("/unsubscribe")
    public String unsubscribe(Model model) {
        model.addAttribute("request", "unsubscribe");
        model.addAttribute("type", "Наш запрос");
        return "requests";
    }

    @GetMapping("/request/{data}")
    public String request(Model model, @PathVariable String data) {
        model.addAttribute("request", data);
        model.addAttribute("type", "Не наш запрос");
        return "requests";
    }

}