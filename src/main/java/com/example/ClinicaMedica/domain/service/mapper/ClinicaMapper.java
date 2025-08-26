package com.example.ClinicaMedica.domain.service.mapper;

import com.example.ClinicaMedica.domain.Model.ClinicaMedica;
import com.example.ClinicaMedica.domain.Model.dto.ClinicaDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", unmappedSourcePolicy = org.mapstruct.ReportingPolicy.WARN)
public interface ClinicaMapper {

    ClinicaMedica toEntity (ClinicaDTO clinicaDTO);
    ClinicaDTO toDTO(ClinicaMedica  clinicaMedica);
    List<ClinicaDTO> toDTOList (List<ClinicaMedica> clinicaMedica);


}
