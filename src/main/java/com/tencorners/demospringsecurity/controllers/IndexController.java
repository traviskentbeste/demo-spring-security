package com.tencorners.demospringsecurity.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "index.jsp";
    }

    @RequestMapping("/login")
    public String login() {
        return "login.jsp";
    }

    @RequestMapping("/logout-success")
    public String logout() {
        return "logout.jsp";
    }
}
