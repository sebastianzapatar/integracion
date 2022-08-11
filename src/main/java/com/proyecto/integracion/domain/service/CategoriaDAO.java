package com.proyecto.integracion.domain.service;

import com.proyecto.integracion.persistence.crud.CategoriaRepository;
import com.proyecto.integracion.persistence.crud.ICategoriaJPARepository;
import com.proyecto.integracion.persistence.entity.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service//voy a exponerlo en el controlador
public class CategoriaDAO implements ICategoriaDAO{
    @Autowired
    ICategoriaJPARepository consultas;
    @Override
    public List<Categoria> todas() {
        return consultas.findAll();
    }

    @Override
    public Optional<Categoria> findById(Integer id){
        return consultas.findById(id);
    }
}
