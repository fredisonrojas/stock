package com.stock.stock.aplicacion.mapper;

import com.stock.stock.aplicacion.dto.respuesta.CategoriaDtoRespuesta;
import com.stock.stock.domain.modelo.Categoria;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)



public interface ICategoriaRespuestaMapper {
    CategoriaDtoRespuesta toCategoriaDto (Categoria categoria);

    default List<CategoriaDtoRespuesta> toListDtoRespuesta(List<Categoria> categorias){
        List<CategoriaDtoRespuesta>  categoriaDtoRespuestas = List.of();
        for (Categoria categoria: categorias){
            CategoriaDtoRespuesta categoriaDtoRespuesta = toCategoriaDto(categoria);
            categoriaDtoRespuestas.add(categoriaDtoRespuesta);

        }
         return categoriaDtoRespuestas;
    }
}
