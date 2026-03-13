package com.proyecto.CineAPI.controlador;

import com.proyecto.CineAPI.model.Cine;
import com.proyecto.CineAPI.servicio.CineServicio;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/peliculas")
public class CineControlador {
    private final CineServicio cineServicio;


    public CineControlador(CineServicio cineServicio) {
        this.cineServicio = cineServicio;
    }

    @GetMapping
    public ResponseEntity<List<Cine>> obtenerPeliculas(){
        return new ResponseEntity<>(cineServicio.obtenerPeliculas(), HttpStatus.OK);
    }

    @GetMapping("/{idL}")
    public ResponseEntity<Cine> obtenerPeliculaPorId(@PathVariable Long idL){
        Cine pelicula = cineServicio.obtenerPeliculaPorId(idL);

        if (pelicula == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(pelicula, HttpStatus.OK);
    }



}
