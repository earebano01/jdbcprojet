package com.jdbcprojet.jdbcprojet.controller;

import com.jdbcprojet.jdbcprojet.repository.TemperatureRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/temperature")
public class TemperatureController {

    private final TemperatureRepository temperatureRepository;

    public TemperatureController(TemperatureRepository temperatureRepository){
        this.temperatureRepository = temperatureRepository;
    }

    @GetMapping
    public ResponseEntity getAllTemperature() {
        return ResponseEntity.ok(this.temperatureRepository.findAll());
    }
    
}
