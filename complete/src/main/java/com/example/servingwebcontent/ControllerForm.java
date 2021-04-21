package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerForm {
    @PostMapping("/formGonzalo")
    public String form(String nombre,String pass,Model model){
        model.addAttribute("name", nombre);
        model.addAttribute("pass", pass);
        return "resultadoPeticiones";
    }
    @GetMapping("/formGonzalo")
    public String postForm(String personName,String pass,Model model){
        return "formGonzalo";
    }
}