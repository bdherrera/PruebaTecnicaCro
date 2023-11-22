package com.example.pruebatecnica.repository;

import com.example.pruebatecnica.dto.Personaje;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonajeRepository extends JpaRepository<Personaje, Long> {
}

