package com.jdbcprojet.jdbcprojet.controller;

import com.jdbcprojet.jdbcprojet.model.Temperature;
import com.jdbcprojet.jdbcprojet.repository.TemperatureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
public class TemperatureViewController {

    private final TemperatureRepository temperatureRepository;

    public TemperatureViewController(TemperatureRepository temperatureRepository) {
        this.temperatureRepository = temperatureRepository;
    }

    @GetMapping("/temperatureView")
    public String getTemperatureView(Model model) {
        List<Temperature> temperatureList = temperatureRepository.findAll();
        List<String> xValues = new ArrayList<>();
        List<Float> yValues = new ArrayList<>();

        for (Temperature temperature : temperatureList) {
            xValues.add(temperature.getFormattedDate());
            yValues.add(temperature.getTemperature());
        }

        model.addAttribute("temperature", temperatureRepository.findAll());
        model.addAttribute("xValues", xValues);
        model.addAttribute("yValues", yValues);

        return "temperatureView";
    }
}
