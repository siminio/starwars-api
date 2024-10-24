package com.demo.starwars_api.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.demo.starwars_api.models.People;
import com.demo.starwars_api.rest.SwapiRestClient;

@Repository
public class PeopleRepository {
     @Autowired
    SwapiRestClient<People> restClient;

    @Value("${swapi.endpoints.people}")
    private String endpointPeople;

    public List<People> findAllPeople() {
        return restClient.findAllElements(endpointPeople);
    }

    public People findPersonById(int id) {
        return restClient.findById(People.class, endpointPeople, id);
    }

    public List<People> findPeopleBySearch(String searchTerm) {
        return restClient.search(endpointPeople, searchTerm);
    }
    
}
