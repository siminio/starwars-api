package com.demo.starwars_api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.starwars_api.models.Film;
import com.demo.starwars_api.repository.FilmRepository;

import java.util.List;

@RestController
public class FilmController {

    @Autowired
    FilmRepository filmRepository;

    @GetMapping("/films")
    List<Film> getAllFilms() {
        return filmRepository.findAllFilms();
    }

    @GetMapping("/films/{id}")
    Film getFilmById(@PathVariable int id) {
        return filmRepository.findFilmById(id);
    }

    @GetMapping("/films/search/{searchTerm}")
    List<Film> getFilmBySearch(@PathVariable String searchTerm) {
        return filmRepository.findFilmsBySearch(searchTerm);
    }
    
}
