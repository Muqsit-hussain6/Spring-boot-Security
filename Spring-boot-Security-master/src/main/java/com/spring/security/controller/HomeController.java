package com.spring.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class HomeController {

    @GetMapping("/home")
    public String home(){
        return "This is home";
    }

    @GetMapping("/login")
    public String login(){
        return "This is login page";
    }

    @GetMapping("/register")
    public String Register(){
        return "This is register page";
    }



}
