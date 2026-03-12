package com.proyecto.CineAPI.exception;

public class PeliculaNoEncontrada extends RuntimeException {
    public PeliculaNoEncontrada(String message) {
        super(message);
    }
}
