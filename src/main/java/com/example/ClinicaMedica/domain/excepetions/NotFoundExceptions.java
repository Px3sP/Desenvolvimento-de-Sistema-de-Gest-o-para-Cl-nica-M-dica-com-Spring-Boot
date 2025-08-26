package com.example.ClinicaMedica.domain.excepetions;

public class NotFoundExceptions extends RuntimeException {

    public NotFoundExceptions(){
        super();
    }

    public NotFoundExceptions(String message){
        super(message);
    }
}

