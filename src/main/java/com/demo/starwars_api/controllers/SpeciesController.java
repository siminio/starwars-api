package com.demo.starwars_api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.starwars_api.models.Species;
import com.demo.starwars_api.repository.SpeciesRepository;

import java.util.List;

@RestController
public class SpeciesController {

    @Autowired
    SpeciesRepository speciesRepository;

    @GetMapping("/species")
    List<Species> getAllSpecies() {
        return speciesRepository.findAllSpecies();
    }

    @GetMapping("/species/{id}")
    Species getSpeciesById(@PathVariable int id) {
        return speciesRepository.findSpeciesById(id);
    }

    @GetMapping("/species/search/{searchTerm}")
    List<Species> getSpeciesBySearch(@PathVariable String searchTerm) {
        return speciesRepository.findSpeciesBySearch(searchTerm);
    }
    
}
