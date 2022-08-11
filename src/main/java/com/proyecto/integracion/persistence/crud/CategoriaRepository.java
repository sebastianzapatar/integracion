package com.proyecto.integracion.persistence.crud;

import com.proyecto.integracion.persistence.entity.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository// se encarga de interactuar con la base de datos
public class CategoriaRepository {

    private ICategoriaJPARepository busquedas;
    public List<Categoria> getAll(){
        return busquedas.findAll();
    }
    public Optional<Categoria> findbyId(Integer id){
        return busquedas.findById(id);
    }
    public Categoria guardar(Categoria e){
        return busquedas.save(e);
    }
    public void borrar(Integer id){
        busquedas.deleteById(id);
    }
}
