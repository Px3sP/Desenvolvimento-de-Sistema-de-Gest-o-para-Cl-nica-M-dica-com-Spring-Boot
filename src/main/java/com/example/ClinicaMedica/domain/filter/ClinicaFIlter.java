package com.example.ClinicaMedica.domain.filter;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.UUID;

public class ClinicaFIlter {

    private UUID id;
    private String nome;
    private LocalDate nascimento;
    private String endereco;
    private String telefone;
    private String email;
}
