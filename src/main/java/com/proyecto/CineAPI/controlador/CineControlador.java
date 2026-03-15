package com.proyecto.CineAPI.controlador;

import com.proyecto.CineAPI.model.Cine;
import com.proyecto.CineAPI.servicio.CineServicio;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/peliculas")
public class CineControlador {
    private final CineServicio cineServicio;


    public CineControlador(CineServicio cineServicio) {
        this.cineServicio = cineServicio;
    }

    @PostMapping
    public ResponseEntity<Cine> crearPelicula(@RequestBody Cine pelicula) {
        Cine creada = cineServicio.crearPelicula(pelicula);
        return new ResponseEntity<>(creada, HttpStatus.CREATED);
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
    @PutMapping("/{idL}")
    public ResponseEntity<Cine> actualizarPelicula(@PathVariable Long idL, @RequestBody Cine peliculaActualizada) {
        Cine pelicula = cineServicio.actualizarPelicula(idL, peliculaActualizada);

        if (pelicula == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(pelicula, HttpStatus.OK);
    }


}
