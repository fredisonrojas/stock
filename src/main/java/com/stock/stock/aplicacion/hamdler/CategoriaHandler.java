package com.stock.stock.aplicacion.hamdler;

import com.stock.stock.aplicacion.dto.peticion.CategoriaDtoPeticion;
import com.stock.stock.aplicacion.dto.respuesta.CategoriaDtoRespuesta;
import com.stock.stock.aplicacion.mapper.ICategoriaPeticionMapper;
import com.stock.stock.aplicacion.mapper.ICategoriaRespuestaMapper;
import com.stock.stock.domain.api.ICategoriaServicePort;
import com.stock.stock.domain.modelo.Categoria;
import jakarta.persistence.Id;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class CategoriaHandler implements ICategoriaHandler{

    private final ICategoriaServicePort categoriaServicePort;
    private final ICategoriaPeticionMapper categoriaPeticionMapper;
    private final ICategoriaRespuestaMapper categoriaRespuestaMapper;


    @Override
    public void crearCategoria(CategoriaDtoPeticion categoriaDtoPeticion) {
        categoriaServicePort.crearCategoria(categoriaPeticionMapper.toCategoria(categoriaDtoPeticion));

        
    }

    @Override
    public List<CategoriaDtoRespuesta> ListarCategoria() {
        return categoriaPeticionMapper.toCategoria(categoriaServicePort.obtenerCategoria(). );
    }

    @Override
    public CategoriaDtoRespuesta obtenerCategoria(Long id) {
        Categoria categoria = categoriaServicePort.obtenerCategoria(Long id);
        return categoriaRespuestaMapper.toCategoriaDto(categoria);
    }

    @Override
    public void actualizar(CategoriaDtoPeticion categoriaDtoPeticion) {
        ICategoriaServicePort.actualizar(categoriaPeticionMapper.toCategoria(categoriaDtoPeticion));


    }

    @Override
    public void eliminar(Long id) {

    }


}
