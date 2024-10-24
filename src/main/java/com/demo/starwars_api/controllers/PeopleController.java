package com.demo.starwars_api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.starwars_api.models.People;
import com.demo.starwars_api.repository.PeopleRepository;

@RestController
public class PeopleController {
    @Autowired
    PeopleRepository peopleRepository;

    @GetMapping("/people")
    List<People> getAllPeople() {
        return peopleRepository.findAllPeople();
    }

    @GetMapping("/people/{id}")
    People getPersonById(@PathVariable int id) {
        return peopleRepository.findPersonById(id);
    }

    @GetMapping("/people/search/{searchTerm}")
    List<People> getPeopleBySearch(@PathVariable String searchTerm) {
        return peopleRepository.findPeopleBySearch(searchTerm);
    }
    
}
