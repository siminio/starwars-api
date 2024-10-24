package com.demo.starwars_api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.starwars_api.models.Vehicle;
import com.demo.starwars_api.repository.VehicleRepository;

import java.util.List;

@RestController
public class VehicleController {

    @Autowired
    VehicleRepository VehicleRepository;

    @GetMapping("/vehicles")
    List<Vehicle> getAllVehicles() {
        return VehicleRepository.findAllVehicles();
    }

    @GetMapping("/vehicles/{id}")
    Vehicle getVehicleById(@PathVariable int id) {
        return VehicleRepository.findVehicleById(id);
    }

    @GetMapping("/vehicles/search/{searchTerm}")
    List<Vehicle> getVehicleBySearch(@PathVariable String searchTerm) {
        return VehicleRepository.findVehiclesBySearch(searchTerm);
    }
    
}

