package com.example.ClinicaMedica.domain.respository;

import com.example.ClinicaMedica.domain.Model.ClinicaMedica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ClinicaRepository extends JpaRepository<ClinicaMedica, UUID> {
}
