package com.demo.starwars_api.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.demo.starwars_api.models.Species;
import com.demo.starwars_api.rest.SwapiRestClient;

@Repository
public class SpeciesRepository {
    @Autowired
    SwapiRestClient<Species> restClient;

    @Value("${swapi.endpoints.species}")
    private String endpointSpecies;

    public List<Species> findAllSpecies() {
        return restClient.findAllElements(endpointSpecies);
    }

    public Species findSpeciesById(int id) {
        return restClient.findById(Species.class, endpointSpecies, id);
    }

    public List<Species> findSpeciesBySearch(String searchTerm) {
        return restClient.search(endpointSpecies, searchTerm);
    }
}