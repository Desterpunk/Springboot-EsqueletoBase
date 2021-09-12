package com.sofkau.crudPerson.controlador;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.dao.InvalidDataAccessApiUsageException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

@RestControllerAdvice
public class ApiHandlerController {
    @ExceptionHandler({NoSuchElementException.class, EmptyResultDataAccessException.class,
            InvalidDataAccessApiUsageException.class})
    public ResponseEntity<Map> personaNoEncontrada(){
        Map<String, String> response = new HashMap<>();
        response.put("error","Error! Persona no encontrada");
        response.put("mensaje","La persona con ese id no se encuentra registrada en nuestro sistema");
        return new ResponseEntity<Map>(response, HttpStatus.BAD_REQUEST);
    }
}
