package com.examen.SegundoParcial.controlador;

import java.util.List;

import com.examen.SegundoParcial.model.Sitios;
import com.examen.SegundoParcial.service.ServiceSitio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Sitios")
public class ControlerSitios {
   
    @Autowired 
    private ServiceSitio service;
   
    
    @GetMapping("/grupo2/lista")
    public  List<Sitios> listar(){

        return service.listar();
    }

    @PostMapping("/grupo2/insertlista")
    public Sitios guardarCarreras(@RequestBody Sitios carreras){
        return this.service.GuardarSitio(carreras);

    }
    @DeleteMapping("/grupo2/lista/{id}")  
    public void DeleteMapping(@PathVariable int id){
      service.delete(id);
    }
    

}
