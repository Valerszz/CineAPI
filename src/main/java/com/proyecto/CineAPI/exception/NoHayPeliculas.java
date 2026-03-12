package com.proyecto.CineAPI.exception;

public class NoHayPeliculas extends RuntimeException {
    public NoHayPeliculas(String message) {
        super(message);
    }
}
