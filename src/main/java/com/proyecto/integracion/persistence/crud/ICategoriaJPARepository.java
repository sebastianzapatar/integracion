package com.proyecto.integracion.persistence.crud;

import com.proyecto.integracion.persistence.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoriaJPARepository extends JpaRepository<Categoria,Integer> {
}
