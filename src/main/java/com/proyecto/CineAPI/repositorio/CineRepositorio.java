package com.proyecto.CineAPI.repositorio;

import com.proyecto.CineAPI.exepciones.ValidacionExepcion;
import com.proyecto.CineAPI.model.Cine;
import com.proyecto.CineAPI.servicio.CineServicio;
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
        log.info("Película creada correctamente con el id: ", pelicula.getIdL(), pelicula.getNombrePelicula());
        return pelicula;
    }

    public  List<Cine> obtenerPeliculas(){
        return peliculas;
    }

    public Cine obtenerPeliculaPorId(Long idL){

        for (int i = 0; i < peliculas.size(); i++){
            Cine peliculaDeLista = peliculas.get(i);
            Long idComparar = peliculaDeLista.getIdL();
            if (idComparar == idL){
                return peliculaDeLista;
            }
        }
        return null;
    }
}
