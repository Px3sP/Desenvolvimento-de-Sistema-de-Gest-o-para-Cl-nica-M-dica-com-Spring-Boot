package com.example.ClinicaMedica.domain.Model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Schema(description = "DTO para clinica")
public class ClinicaDTO {


    @Id
    @Column(name = "id")
    @Schema(description = "Identificador de atendimento. ")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Schema(description = "Nome do paciente.")
    @Column(name = "nome")
    private String nome;

    @Schema(description = "Data de nascimento do paciente.")
    @Column(name= "nascimento")
    private LocalDate nascimento;

    @Schema(description = "Endereço do paciente.")
    @Column(name = "endereco")
    private String endereco;

    @Schema(description = "Contato do paciente")
    @Column(name = "telefone")
    private String telefone;

    @Column(name = "email")
    private String email;


}
