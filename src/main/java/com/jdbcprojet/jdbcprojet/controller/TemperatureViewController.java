package com.jdbcprojet.jdbcprojet.controller;

import com.jdbcprojet.jdbcprojet.repository.TemperatureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TemperatureViewController {

    private final TemperatureRepository temperatureRepository;

    public TemperatureViewController(TemperatureRepository temperatureRepository) {
        this.temperatureRepository = temperatureRepository;
    }

    @GetMapping("/temperatureView")
    public String getProductView(Model model) {
        model.addAttribute("temperature", temperatureRepository.findAll());
        return "temperatureView";
    }
}
