package com.example.demo.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


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
}