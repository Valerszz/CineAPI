package com.proyecto.CineAPI.servicio;


import com.proyecto.CineAPI.model.Cine;
import com.proyecto.CineAPI.repositorio.CineRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CineServicio {


    private final CineRepositorio cineRepositorio;

    public CineServicio(CineRepositorio cineRepositorio){
        this.cineRepositorio = cineRepositorio;
    }

    public List<Cine> getCines(){
        return cineRepositorio.getCines();
    }

}
