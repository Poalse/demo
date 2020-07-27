package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

@Controller
public class MainController {

    @GetMapping
    public String main(Model model, HttpServletRequest r)
    {
//        model.addAttribute("address",  String.format("remote addr %s, port %d, user %s, host %s\n"
//                        + "local addr %s, port %d, name %s",
//                r.getRemoteAddr(), r.getRemotePort(), r.getRemoteUser(), r.getRemoteHost(),
//                r.getLocalAddr(), r.getLocalPort(), r.getLocalName()));
        return "main";
    }

    @GetMapping("get_user")
    public @ResponseBody User getUser() {
        return new User("Alex", UUID.randomUUID().toString());
    }

}