package com.proyecto.integracion.persistence.mapper;

import com.proyecto.integracion.domain.Category;
import com.proyecto.integracion.persistence.entity.Categoria;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface ICategoryMapper {
    @Mappings({
            @Mapping(source = "idCategoria",target = "categoryId"),
            @Mapping(source = "descripcion",target = "category"),
            @Mapping(source = "estado",target = "active"),
    })
    Category toCategory(Categoria categoria);
    @InheritConfiguration
    Categoria toCategoria(Category category);
}
