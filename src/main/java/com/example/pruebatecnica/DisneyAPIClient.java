package com.example.pruebatecnica;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class DisneyAPIClient {

    private final String apiUrl = "https://api.disney.com/";

    private final RestTemplate restTemplate;

    public DisneyAPIClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getPersonajes() {
        return restTemplate.getForObject(apiUrl + "personajes", String.class);
    }

    // Puedes agregar más métodos para otros endpoints según sea necesario
}
