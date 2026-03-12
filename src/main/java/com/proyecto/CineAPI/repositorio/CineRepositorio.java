package com.proyecto.CineAPI.repositorio;
import com.proyecto.CineAPI.exception.NoHayPeliculas;
import com.proyecto.CineAPI.exception.PeliculaNoEncontrada;
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

    public void eliminarPelicula(Long id) {
        if (peliculas.isEmpty()){
            throw new NoHayPeliculas("No hay películas para borrar");
        }
        boolean eliminada = peliculas.removeIf(peli->peli.getIdL().equals(id));

        if (!eliminada) {
            throw new PeliculaNoEncontrada("No se encontró la película con id: " + id);
        }
    }

}
