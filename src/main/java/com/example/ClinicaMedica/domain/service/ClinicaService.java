package com.example.ClinicaMedica.domain.service;

import com.example.ClinicaMedica.domain.Model.ClinicaMedica;
import com.example.ClinicaMedica.domain.Model.dto.ClinicaDTO;
import com.example.ClinicaMedica.domain.excepetions.NotFoundExceptions;
import com.example.ClinicaMedica.domain.respository.ClinicaRepository;
import com.example.ClinicaMedica.domain.service.mapper.ClinicaMapper;
import org.aspectj.weaver.ast.Not;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class ClinicaService {

    @Autowired
    private ClinicaRepository repository;

    @Autowired
    private ClinicaMapper clinicaMapper;

    public ClinicaDTO save(ClinicaDTO clinicaDTO) {
        ClinicaMedica toEntity = clinicaMapper.toEntity(clinicaDTO);
        ClinicaMedica savedPatient = repository.save(toEntity);
        return clinicaMapper.toDTO(savedPatient);
    }

    public List<ClinicaDTO> getPatient() {
        List<ClinicaMedica> patient = repository.findAll();
        return patient.stream()
                .map(clinicaMapper::toDTO)
                .collect(Collectors.toList());
    }

    public void Delete(UUID id) {
        ClinicaMedica deleteID = repository.findById(id).orElse(null);
        if (deleteID == null) {
            throw new NotFoundExceptions("ID not found.");
        }
        repository.deleteById(id);
    }

    public ClinicaMedica update(UUID id, ClinicaDTO clinicaDTO) {
        ClinicaMedica searchPatient = repository.findById(id).orElse(null);
        if (searchPatient == null) {
            throw new NotFoundExceptions("Patient not found.");
        }
        searchPatient.setTelefone(clinicaDTO.getTelefone());
        searchPatient.setEndereco(clinicaDTO.getEndereco());

        return repository.save(searchPatient);
    }


}
