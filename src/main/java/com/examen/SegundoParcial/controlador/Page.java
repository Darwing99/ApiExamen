package com.examen.SegundoParcial.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

@RequestMapping()
public class Page {
  
    @GetMapping("/")
    public String listar( Model model) {
        
        return "index";
    }
  
}

