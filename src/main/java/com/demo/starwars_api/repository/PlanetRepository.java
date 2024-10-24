package com.demo.starwars_api.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.demo.starwars_api.models.Planet;
import com.demo.starwars_api.rest.SwapiRestClient;

@Repository
public class PlanetRepository {
    @Autowired
    SwapiRestClient<Planet> restClient;

    @Value("${swapi.endpoints.planets}")
    private String endpointPlanets;

    public List<Planet> findAllPlanets() {
        return restClient.findAllElements(endpointPlanets);
    }

    public Planet findPlanetById(int id) {
        return restClient.findById(Planet.class, endpointPlanets, id);
    }

    public List<Planet> findPlanetsBySearch(String searchTerm) {
        return restClient.search(endpointPlanets, searchTerm);
    }
}
