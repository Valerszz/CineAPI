package com.proyecto.CineAPI.controlador;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class CineControlador {
    @DeleteMapping("{idL}")
    public String deleteEstudiante(@PathVariable Long idL) {
        return "Película eliminada";
    }



}
