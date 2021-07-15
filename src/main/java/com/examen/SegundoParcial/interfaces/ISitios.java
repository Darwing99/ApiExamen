package com.examen.SegundoParcial.interfaces;

import com.examen.SegundoParcial.model.Sitios;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ISitios extends CrudRepository<Sitios,Integer> {
    int deleteById(int id);
}
