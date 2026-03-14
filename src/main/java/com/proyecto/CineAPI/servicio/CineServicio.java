package com.proyecto.CineAPI.servicio;

import com.proyecto.CineAPI.exepciones.ValidacionExepcion;
import com.proyecto.CineAPI.exepciones.ValidacionNotFoundException;
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

    public CineServicio(CineRepositorio cineRepositorio){
        this.cineRepositorio = cineRepositorio;
    }

    private static final List<String> salasValidas =
            Arrays.asList("2D", "3D", "VIP", "IMAX", "4DX", "KIDS", "XD");

    public Cine crearPelicula(Cine pelicula) {
        validarPelicula(pelicula);
        Cine creada = cineRepositorio.crearPelicula(pelicula);
        log.info("Película creada: ", creada.getIdL());
        return creada;
    }
    public List<Cine> obtenerPeliculas(){
        return cineRepositorio.obtenerPeliculas();
    }
    public Cine obtenerPeliculaPorId(Long idL){
        if (idL == null || idL < 0){
            log.warn("Error: ID inválido.");
            throw new ValidacionExepcion("El ID a ingresar debe de ser mayor a cero y/o diferente a vacío.");
        }
        Cine pelicula = cineRepositorio.obtenerPeliculaPorId(idL);
        if (pelicula == null){
            log.warn("Error: ID no encontrado.");
            throw new ValidacionNotFoundException("Ninguna película en la cartelera está registrada con el ID ingresado.");
        }
        log.info("Película encontrada exitosamente con el ID: {}.", idL);
        return pelicula;
    }

    private void validarPelicula(Cine pelicula) {
        if (pelicula.getNombrePelicula() == null || pelicula.getNombrePelicula().isBlank()) {
            log.warn("Error: el titulo de la película esta mal");
            throw new ValidacionExepcion("El titulo de la película no debe estar vacío");
        }

        if (pelicula.getTipoSala() == null || !salasValidas.contains(pelicula.getTipoSala().toUpperCase())) {
            log.warn("Error: tipo de sala no válida: ", pelicula.getTipoSala());
            throw new ValidacionExepcion(
                    "Sala incorrecta, solo se aceptan: " + salasValidas);
        }
    }
}
