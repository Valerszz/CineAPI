package com.proyecto.CineAPI.repositorio;

import com.proyecto.CineAPI.model.Cine;

import java.util.ArrayList;
import java.util.List;

public class CineRepositorio {
    private final List<Cine> cines = new ArrayList<>();

    public List<Cine> getCines(){
        return cines;
    }



}
