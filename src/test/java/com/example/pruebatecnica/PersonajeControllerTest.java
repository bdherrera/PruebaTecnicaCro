package com.example.pruebatecnica;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class PersonajeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testCrearPersonaje() throws Exception {
        // Crea un JSON representando un nuevo personaje
        String nuevoPersonajeJson = "{\"nombre\": \"Mickey Mouse\", \"tvShow\": \"Mickey Mouse Clubhouse\", \"disneyApiId\": 1, \"foto\": \"url_de_la_foto\"}";

        // Realiza una solicitud HTTP para crear un nuevo personaje
        mockMvc.perform(MockMvcRequestBuilders.post("/api/personajes")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(nuevoPersonajeJson))
                .andExpect(MockMvcResultMatchers.status().isCreated());
    }
}
