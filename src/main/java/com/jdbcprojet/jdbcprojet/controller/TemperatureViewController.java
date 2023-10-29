// Cette ligne importe les classes nécessaires pour le contrôleur Spring Boot.
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

    // Cet attribut est une référence au repository pour la gestion des températures.
    private final TemperatureRepository temperatureRepository;

    // Le constructeur permet d'injecter le repository dans le contrôleur.
    public TemperatureViewController(TemperatureRepository temperatureRepository) {
        this.temperatureRepository = temperatureRepository;
    }

    // Cette méthode gère les requêtes GET pour afficher la vue des températures.
    @GetMapping("/temperatureView")
    public String getTemperatureView(Model model) {
        // On récupère la liste de toutes les températures depuis le repository.
        List<Temperature> temperatureList = temperatureRepository.findAll();
        
        // On prépare deux listes, une pour les valeurs X (dates formatées) et l'autre pour les valeurs Y (températures).
        List<String> xValues = new ArrayList<>();
        List<Float> yValues = new ArrayList<>();

        // On itère sur la liste des températures pour extraire les valeurs nécessaires.
        for (Temperature temperature : temperatureList) {
            xValues.add(temperature.getFormattedDate());
            yValues.add(temperature.getTemperature());
        }

        // On ajoute les listes de températures, valeurs X et valeurs Y au modèle de la vue.
        model.addAttribute("temperature", temperatureRepository.findAll());
        model.addAttribute("xValues", xValues);
        model.addAttribute("yValues", yValues);

        // On retourne le nom de la vue à afficher (dans ce cas, "temperatureView").
        return "temperatureView";
    }
}
