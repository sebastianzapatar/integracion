package com.proyecto.integracion.web.controller;

import com.proyecto.integracion.domain.service.ICategoriaDAO;
import com.proyecto.integracion.persistence.entity.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/otra")
public class Controlador {
    @Autowired
    ICategoriaDAO consulta;
    @GetMapping("/todos")
    public List<Categoria> todos(){
        return consulta.todas();
    }
    @GetMapping("/buscar/{id}")
    public Optional<Categoria> uno(@PathVariable Integer id){
        return consulta.findById(id);
    }
}
