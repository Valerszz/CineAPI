package com.proyecto.CineAPI.controlador;

import com.proyecto.CineAPI.servicio.CineServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/peliculas")
public class CineControlador {
    @Autowired
    private CineServicio cineServicio;

    @DeleteMapping("{idL}")
    public String borrarPelicula(@PathVariable Long idL) {
        return cineServicio.eliminarPelicula(idL);
    }



}
