package com.example.pruebatecnica.service;

import com.example.pruebatecnica.DisneyAPIClient;
import org.springframework.stereotype.Service;

@Service
public class PersonajeService {

    private final DisneyAPIClient disneyAPIClient;

    public PersonajeService(DisneyAPIClient disneyAPIClient) {
        this.disneyAPIClient = disneyAPIClient;
    }

    public String obtenerPersonajes() {
        return disneyAPIClient.getPersonajes();
    }

    // Puedes agregar más métodos según sea necesario
}
