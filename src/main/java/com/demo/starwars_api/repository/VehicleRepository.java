package com.demo.starwars_api.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.demo.starwars_api.models.Vehicle;
import com.demo.starwars_api.rest.SwapiRestClient;

@Repository
public class VehicleRepository {
    @Autowired
    SwapiRestClient<Vehicle> restClient;

    @Value("${swapi.endpoints.vehicles}")
    private String endpointVehicles;

    public List<Vehicle> findAllVehicles() {
        return restClient.findAllElements(endpointVehicles);
    }

    public Vehicle findVehicleById(int id) {
        return restClient.findById(Vehicle.class, endpointVehicles, id);
    }

    public List<Vehicle> findVehiclesBySearch(String searchTerm) {
        return restClient.search(endpointVehicles, searchTerm);
    }
}