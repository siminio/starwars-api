package com.demo.starwars_api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.starwars_api.models.Planet;
import com.demo.starwars_api.repository.PlanetRepository;

import java.util.List;

@RestController
public class PlanetController {

    @Autowired
    PlanetRepository planetRepository;

    @GetMapping("/planets")
    List<Planet> test() {
        return planetRepository.findAllPlanets();
    }

    @GetMapping("/planets/{id}")
    Planet getPlanetById(@PathVariable int id) {
        return planetRepository.findPlanetById(id);
    }

    @GetMapping("/planets/search/{searchTerm}")
    List<Planet> testSearch(@PathVariable String searchTerm) {
        return planetRepository.findPlanetsBySearch(searchTerm);
    }
    
}
