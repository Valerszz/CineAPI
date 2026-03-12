package com.proyecto.CineAPI.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<String> handleNoHayPeliculas(NoHayPeliculas noHayPeliculas) { //Param
        return new ResponseEntity<>(noHayPeliculas.getMessage(), HttpStatus.NOT_FOUND); //El status code
    }

    @ExceptionHandler
    public ResponseEntity<String> handlePeliculaNoEncontrada(PeliculaNoEncontrada peliculaNoEncontrada) { //Param
        return new ResponseEntity<>(peliculaNoEncontrada.getMessage(), HttpStatus.NOT_FOUND); //El status code
    }
}
