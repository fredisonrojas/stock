package com.stock.stock.domain.useCase;

import com.stock.stock.domain.api.ICategoriaServicePort;
import com.stock.stock.domain.modelo.Categoria;
import com.stock.stock.domain.spi.ICategoriaPersistencePort;

import java.util.List;

public class CategoriaUsercase implements ICategoriaServicePort {

    private final ICategoriaPersistencePort persistencePort;

    public CategoriaUsercase(ICategoriaPersistencePort persistencePort) {
        this.persistencePort = persistencePort;
    }

    @Override
    public void crearCategoria(Categoria categoria) {
        persistencePort.crearCategoria(categoria);

    }

    @Override
    public List<Categoria> ListarCategoria() {
        return persistencePort.ListarCategoria();
    }

    @Override
    public List obtenerCategoria(Long id) {
        return persistencePort.obtenerCategoria(id);
    }

    @Override
    public void actualizar(Categoria categoria) {
        persistencePort.actualizar(categoria);

    }

    @Override
    public void eliminar(Long id) {
        persistencePort.eliminar(id);

    }
}
