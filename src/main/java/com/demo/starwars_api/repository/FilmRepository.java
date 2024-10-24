package com.demo.starwars_api.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.demo.starwars_api.models.Film;
import com.demo.starwars_api.rest.SwapiRestClient;

@Repository
public class FilmRepository {
     @Autowired
    SwapiRestClient<Film> restClient;

    @Value("${swapi.endpoints.films}")
    private String endpointFilms;

    public List<Film> findAllFilms() {
        return restClient.findAllElements(endpointFilms);
    }

    public Film findFilmById(int id) {
        return restClient.findById(Film.class, endpointFilms, id);
    }

    public List<Film> findFilmsBySearch(String searchTerm) {
        return restClient.search(endpointFilms, searchTerm);
    }
    
}
