package com.proyecto.CineAPI.servicio;

import com.proyecto.CineAPI.exepciones.ValidacionExepcion;
import com.proyecto.CineAPI.model.Cine;
import com.proyecto.CineAPI.repositorio.CineRepositorio;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
@Slf4j
public class CineServicio {
    private CineRepositorio cineRepositorio;

    private static final List<String> salasValidas =
            Arrays.asList("2D", "3D", "VIP", "IMAX", "4DX", "KIDS", "XD");

    public Cine crearPelicula(Cine pelicula) {
        validarPelicula(pelicula);
        Cine creada = cineRepositorio.crearPelicula(pelicula);
        log.info("Pelicula creada: ", creada.getIdL());
        return creada;
    }
    public List<Cine> obtenerPeliculas(){
        return cineRepositorio.obtenerPeliculas();
    }
    public Cine obtenerPeliculaPorId(Long idL){
        return cineRepositorio.obtenerPeliculaPorId(idL);
    }

    private void validarPelicula(Cine pelicula) {
        if (pelicula.getNombrePelicula() == null || pelicula.getNombrePelicula().isBlank()) {
            log.warn("Error: el titulo de la pelicula esta mal");
            throw new ValidacionExepcion("El titulo de la pelicula no debe estar vacio");
        }

        if (pelicula.getTipoSala() == null || !salasValidas.contains(pelicula.getTipoSala().toUpperCase())) {
            log.warn("Error: tipo de sala no valida: ", pelicula.getTipoSala());
            throw new ValidacionExepcion(
                    "Sala incorrecta, solo se acceptan: " + salasValidas);
        }
    }
}
