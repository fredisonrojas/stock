package com.stock.stock.aplicacion.mapper;


import com.stock.stock.aplicacion.dto.peticion.CategoriaDtoPeticion;
import com.stock.stock.domain.modelo.Categoria;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)

public interface ICategoriaPeticionMapper {
    Categoria toCategoria(CategoriaDtoPeticion CategoriaDto);

}
