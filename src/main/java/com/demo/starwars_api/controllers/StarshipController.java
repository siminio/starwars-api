package com.demo.starwars_api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.starwars_api.models.Starship;
import com.demo.starwars_api.repository.StarshipRepository;

import java.util.List;

@RestController
public class StarshipController {

    @Autowired
    StarshipRepository starshipRepository;

    @GetMapping("/starships")
    List<Starship> getAllStarships() {
        return starshipRepository.findAllStarships();
    }

    @GetMapping("/starships/{id}")
    Starship getStarshipById(@PathVariable int id) {
        return starshipRepository.findStarshipById(id);
    }

    @GetMapping("/starships/search/{searchTerm}")
    List<Starship> getStarshipBySearch(@PathVariable String searchTerm) {
        return starshipRepository.findStarshipsBySearch(searchTerm);
    }
    
}
