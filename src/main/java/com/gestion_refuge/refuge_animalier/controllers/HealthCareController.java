package com.gestion_refuge.refuge_animalier.controllers;

import com.gestion_refuge.refuge_animalier.dtos.healthCareDTOs.HealthCareRequestDTO;
import com.gestion_refuge.refuge_animalier.entities.HealthCare;
import com.gestion_refuge.refuge_animalier.services.HealthCareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/healthcare")
public class HealthCareController {

    @Autowired
    private HealthCareService healthCareService;

    @GetMapping
    public ResponseEntity<List<HealthCare>> getHealthCares(){
        return new ResponseEntity<>(healthCareService.getAllHealthCares(), HttpStatus.OK);
    }

    @GetMapping("/next")
    public List<HealthCare> getNextFive() {
        return healthCareService.getNextFiveHealthCares();
    }

    @GetMapping("/animal/{animalId}")
    public List<HealthCare> getHealthCaresForAnimal(@PathVariable Long animalId) {
        return healthCareService.getHealthCaresByAnimal(animalId);
    }

    @PostMapping
    public ResponseEntity<HealthCare> addHealthCare(@RequestBody HealthCareRequestDTO request) {
        return new ResponseEntity<>(healthCareService.addHealthCare(request), HttpStatus.CREATED);
    }
}
