package com.example.ClinicaMedica.domain.infra;

import com.example.ClinicaMedica.domain.excepetions.NotFoundExceptions;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(NotFoundExceptions.class)
    public ResponseEntity<String> notFoundHandler(NotFoundExceptions exception){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception.getMessage());
    }
}
