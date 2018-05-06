package com.example.app.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("name", "Archit");
        return "home";
    }

    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name, Model model) {
        String greet = " Hello !!!" + name + " How are You?";
        model.addAttribute("greet", greet);
        System.out.println(greet);
        return "greet";
    }
}
