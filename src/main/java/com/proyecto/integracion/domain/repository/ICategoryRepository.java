package com.proyecto.integracion.domain.repository;

import com.proyecto.integracion.domain.Category;
import com.proyecto.integracion.persistence.entity.Categoria;

import java.util.List;
import java.util.Optional;

public interface ICategoryRepository {
    List<Category> getAll();
    Optional<Category> getById(int idCategory);
    Category SAVE(Category e);
    void delete(int idCategory);
}
