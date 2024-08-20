package com.stock.stock.aplicacion.hamdler;

import com.stock.stock.aplicacion.dto.peticion.CategoriaDtoPeticion;
import com.stock.stock.aplicacion.dto.respuesta.CategoriaDtoRespuesta;
import com.stock.stock.domain.modelo.Categoria;

import java.util.List;

public interface ICategoriaHandler {

    void crearCategoria(CategoriaDtoPeticion categoria);

    List<CategoriaDtoRespuesta> ListarCategoria();

     CategoriaDtoRespuesta obtenerCategoria(Long id);

    void actualizar (CategoriaDtoPeticion categoria);

    void eliminar (Long id);
}
