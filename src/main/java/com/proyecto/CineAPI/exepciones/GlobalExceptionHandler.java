package com.proyecto.CineAPI.exepciones;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class GlobalExceptionHandler {
    @ControllerAdvice
    public class ManejadorExcepciones {

        @ExceptionHandler(ValidacionExepcion.class)
        public ResponseEntity<String> manejarValidacion(ValidacionExepcion validacion) {
            return new ResponseEntity<>(validacion.getMessage(), HttpStatus.BAD_REQUEST);
        }

    }
}

