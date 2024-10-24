package com.demo.starwars_api.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.demo.starwars_api.models.Starship;
import com.demo.starwars_api.rest.SwapiRestClient;

@Repository
public class StarshipRepository {
    @Autowired
    SwapiRestClient<Starship> restClient;

    @Value("${swapi.endpoints.starships}")
    private String endpointStarships;

    public List<Starship> findAllStarships() {
        return restClient.findAllElements(endpointStarships);
    }

    public Starship findStarshipById(int id) {
        return restClient.findById(Starship.class, endpointStarships, id);
    }

    public List<Starship> findStarshipsBySearch(String searchTerm) {
        return restClient.search(endpointStarships, searchTerm);
    }
}
