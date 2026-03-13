package com.proyecto.CineAPI.repositorio;

import com.proyecto.CineAPI.model.Cine;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class CineRepositorio {
    private List<Cine> peliculas = new ArrayList<>();
    private Long contador = 1L;

    public Cine crearPelicula(Cine pelicula) {
        pelicula.setIdL(contador++);
        peliculas.add(pelicula);
        log.info("Pelicula creada correctamente con el id: ", pelicula.getIdL(), pelicula.getNombrePelicula());
        return pelicula;
    }

    public  List<Cine> obtenerPeliculas(){
        return peliculas;
    }
    //todavia falta la lógica de buscar una pelicula por el id, solo se puso return null para subirlo
    // y guardar cambios
    public Cine obtenerPeliculaPorId(Long idL){
        return null;
    }

}
