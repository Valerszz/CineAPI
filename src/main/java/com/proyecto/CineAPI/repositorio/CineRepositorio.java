package com.proyecto.CineAPI.repositorio;
import com.proyecto.CineAPI.model.Cine;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CineRepositorio {
    private List<Cine> peliculas = new ArrayList<>();
    private Long contador = 1L;

    public  List<Cine> crearPeliculas(Cine pelicula) {
        peliculas.add(pelicula);
        return peliculas;
    }

    public String eliminarPelicula(Long id) {
        if (peliculas.isEmpty()){
            return "No hay películas por borrar";
        }
        if (peliculas.removeIf(pelicula->pelicula.getIdL().equals(id))) {
            return "Película eliminada";
        }
        return "No se encontró la película";
    }

}
