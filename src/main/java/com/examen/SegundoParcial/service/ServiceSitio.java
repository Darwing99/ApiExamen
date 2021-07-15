package com.examen.SegundoParcial.service;

import java.util.List;
import java.util.Optional;

import com.examen.SegundoParcial.InterfaceService.ISitiosService;
import com.examen.SegundoParcial.interfaces.ISitios;
import com.examen.SegundoParcial.model.Sitios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceSitio implements ISitiosService{


    @Autowired
    private ISitios sitios;
    @Override
    public List<Sitios> listar() {
      
        return  (List<Sitios>)sitios.findAll();
    }

    @Override
    public Optional<Sitios> listar(int id) {
    
        return null;
    }

    @Override
    public void save(Sitios u) {
      sitios.save(u);
        
    }
   


    public Sitios GuardarSitio(Sitios u){
        return sitios.save(u);

    }
    @Override
    public boolean delete(int id) {
        
        try {
            sitios.deleteById(id);
            return true;
           
       } catch (Exception e) {
          return false;
       }
    }
    
}
