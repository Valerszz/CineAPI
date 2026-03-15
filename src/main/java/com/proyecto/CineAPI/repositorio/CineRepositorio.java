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

    public Cine actualizarPelicula(Long idL, Cine peliculaActualizada) {
        for (int i = 0; i < peliculas.size(); i++) {
            Cine peliculaExistente = peliculas.get(i);

            if (peliculaExistente.getIdL().equals(idL)) {
                peliculaActualizada.setIdL(idL);
                peliculas.set(i, peliculaActualizada);
                log.info("Pelicula actualizada correctamente con id {}", idL);
                return peliculaActualizada;
            }
        }
        return null;
    }
}