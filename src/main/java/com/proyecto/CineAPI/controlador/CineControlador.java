package com.proyecto.CineAPI.controlador;
import com.proyecto.CineAPI.model.Cine;
import com.proyecto.CineAPI.servicio.CineServicio;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cine")

public class CineControlador {

    /*
    Controller recibe las peticiones del usuario, se obtienen los datos necesarios de la ruta o el body. Luego delega la petición a servicio.
     */

    private final CineServicio cineServicio;

    public CineControlador(CineServicio cineServicio) {
        this.cineServicio = cineServicio;
    }
    @GetMapping
    public ResponseEntity<List<Cine>> getAllArtistas(){
        List<Cine> cines = cineServicio.getCines();
        return new ResponseEntity<>(cines, HttpStatus.OK);
    }




}
