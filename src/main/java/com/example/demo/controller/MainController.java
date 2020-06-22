package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Main page");
        return "home";
    }
    @GetMapping("/library")
    public String library(Model model) {
    //   model.addAttribute("title", "Main page");
        return "library";
    }
    @GetMapping("/login")
    public String login(Model model) {
      //  model.addAttribute("title", "Main page");
        return "login";
    }
    @GetMapping("/register")
    public String register(Model model) {
      //  model.addAttribute("title", "Main page");
        return "register";
    }

}