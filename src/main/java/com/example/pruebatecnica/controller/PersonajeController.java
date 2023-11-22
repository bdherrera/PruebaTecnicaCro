package com.example.pruebatecnica.controller;

import com.example.pruebatecnica.dto.Personaje;
import com.example.pruebatecnica.repository.PersonajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/personajes")
public class PersonajeController {

    @Autowired
    private PersonajeRepository personajeRepository;

    @GetMapping
    public List<Personaje> getAllPersonajes() {
        return personajeRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Personaje> getPersonajeById(@PathVariable Long id) {
        Optional<Personaje> personaje = personajeRepository.findById(id);
        return personaje.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @Secured("ADMIN")
    @PostMapping
    public ResponseEntity<Personaje> createPersonaje(@RequestBody Personaje personaje) {
        Personaje nuevoPersonaje = personajeRepository.save(personaje);
        return ResponseEntity.status(201).body(nuevoPersonaje);
    }

    @Secured("ADMIN")
    @PutMapping("/{id}")
    public ResponseEntity<Personaje> updatePersonaje(@PathVariable Long id, @RequestBody Personaje personaje) {
        if (!personajeRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        personaje.setId(id);
        Personaje updatedPersonaje = personajeRepository.save(personaje);
        return ResponseEntity.ok(updatedPersonaje);
    }

    @Secured("ADMIN")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePersonaje(@PathVariable Long id) {
        if (!personajeRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        personajeRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
