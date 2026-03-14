package com.proyecto.CineAPI.exepciones;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ValidacionExepcion.class)
    public ResponseEntity<String> manejarValidacion(ValidacionExepcion validacion) {
        return new ResponseEntity<>(validacion.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ValidacionNotFoundException.class)
    public ResponseEntity<String> manejarNotFound(ValidacionNotFoundException validacionNotFound) {
        return new ResponseEntity<>(validacionNotFound.getMessage(), HttpStatus.NOT_FOUND);
    }

}

