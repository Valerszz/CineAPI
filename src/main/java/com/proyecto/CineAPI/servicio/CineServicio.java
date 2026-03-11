package com.proyecto.CineAPI.servicio;

import com.proyecto.CineAPI.model.Cine;
import com.proyecto.CineAPI.repositorio.CineRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CineServicio {
    private CineRepositorio cineRepositorio;

    @Autowired
    public CineServicio(CineRepositorio cineRepositorio) {
        this.cineRepositorio = cineRepositorio;
    }
    public List<Cine> crearPeliculas(Cine pelicula) {
        return cineRepositorio.crearPeliculas(pelicula);
    }

}
