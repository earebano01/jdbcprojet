// Cette ligne importe les classes nécessaires pour le contrôleur Spring Boot.
package com.jdbcprojet.jdbcprojet.controller;

import com.jdbcprojet.jdbcprojet.repository.TemperatureRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// L'annotation ci-dessous marque cette classe comme un contrôleur Spring Boot.
@RestController
@RequestMapping("/temperature")
public class TemperatureController {

    // Cet attribut est une référence au repository pour la gestion des températures.
    private final TemperatureRepository temperatureRepository;

    // Le constructeur permet d'injecter le repository dans le contrôleur.
    public TemperatureController(TemperatureRepository temperatureRepository){
        this.temperatureRepository = temperatureRepository;
    }

    // Cette méthode gère les requêtes GET pour obtenir toutes les températures.
    @GetMapping
    public ResponseEntity getAllTemperature() {
        // Elle renvoie une réponse HTTP OK avec toutes les températures récupérées du repository.
        return ResponseEntity.ok(this.temperatureRepository.findAll());
    }
}
