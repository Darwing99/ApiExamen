package com.examen.SegundoParcial.InterfaceService;

import java.util.List;
import java.util.Optional;

import com.examen.SegundoParcial.model.Sitios;

public interface ISitiosService {
    public List<Sitios> listar();
    public Optional<Sitios> listar(int id);
    public  void save(Sitios u);
    public boolean delete(int id);

}
