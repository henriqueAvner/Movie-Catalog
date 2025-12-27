package com.exercises.movie_catalog.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GerenciadorExceptionController {

    @ExceptionHandler({MovieNotFoundException.class})
    public ResponseEntity<String> handleNotFound(RuntimeException exception) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Filme não encontrado: " + exception.getMessage());
    }

    @ExceptionHandler({MovieNotCreatedException.class})
    public ResponseEntity<String> handleNotCreated(RuntimeException exception) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Falha ao criar um filme: " + exception.getMessage());
    }

}
