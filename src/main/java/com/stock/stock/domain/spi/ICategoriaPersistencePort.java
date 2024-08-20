package com.stock.stock.domain.spi;

import com.stock.stock.domain.modelo.Categoria;

import java.util.List;

public interface ICategoriaPersistencePort {

    void crearCategoria(Categoria categoria);

    List<Categoria> ListarCategoria();

    List obtenerCategoria(Long id);

    void actualizar (Categoria categoria);

    void eliminar (Long id);
}
