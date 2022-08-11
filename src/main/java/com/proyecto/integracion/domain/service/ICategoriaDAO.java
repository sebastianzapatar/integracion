package com.proyecto.integracion.domain.service;

import com.proyecto.integracion.persistence.entity.Categoria;

import java.util.Calendar;
import java.util.List;
import java.util.Optional;

public interface ICategoriaDAO  {
    public List<Categoria> todas();
    public Optional<Categoria> findById(Integer id);
}
