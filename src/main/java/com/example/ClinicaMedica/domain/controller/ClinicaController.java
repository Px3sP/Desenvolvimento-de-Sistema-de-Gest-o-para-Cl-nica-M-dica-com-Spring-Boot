package com.example.ClinicaMedica.domain.controller;

import com.example.ClinicaMedica.domain.Model.dto.ClinicaDTO;
import com.example.ClinicaMedica.domain.service.ClinicaService;
import io.swagger.v3.oas.annotations.Operation;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping(value = "/clinica")
public class ClinicaController {

    @Autowired
    private ClinicaService service;


    @Operation(summary = "Salvar paciente." ,description = "Salva um novo paciente no sistema.")
    @PostMapping
    public ResponseEntity<ClinicaDTO> savePatient(@RequestBody ClinicaDTO dto){
        ClinicaDTO savePatient = service.save(dto);
        return ResponseEntity.ok(savePatient);
    }

    @Operation(summary = "Buscar todos os pacientes.", description = "Retorna uma lista de todos os pacientes cadastrados.")
    @GetMapping("/all")
    public ResponseEntity<List<ClinicaDTO>> getAllPatient(){
        return ResponseEntity.ok(service.getPatient());
    }

    @Operation(summary = "Deleta paciente por ID. ", description = "Remove um paciente do sistema com base no ID fornecido.")
    @DeleteMapping
    public ResponseEntity<Void> deletePatient(@RequestParam("id") UUID id){
        service.Delete(id);
        return ResponseEntity.noContent().build();
    }

    @Operation(summary = "Atualiza paciente por ID.", description = "Atualiza as informações de um paciente com base no ID fornecido.")
    @PutMapping
    public ResponseEntity<ClinicaDTO> updatePatient(@RequestParam UUID id, @RequestBody ClinicaDTO dto) {
        return ResponseEntity.ok(dto);
    }
}
