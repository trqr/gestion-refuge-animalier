package com.gestion_refuge.refuge_animalier.controllers;

import com.gestion_refuge.refuge_animalier.dtos.healthCareDTOs.HealthCareRequestDTO;
import com.gestion_refuge.refuge_animalier.entities.HealthCare;
import com.gestion_refuge.refuge_animalier.services.HealthCareService;
import jakarta.validation.Valid;
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
    public ResponseEntity<List<HealthCare>> getNextFive() {
        return new ResponseEntity<>(healthCareService.getNextFiveHealthCares(), HttpStatus.OK);
    }

    @GetMapping("/animal/{animalId}")
    public ResponseEntity<List<HealthCare>> getHealthCaresForAnimal(@PathVariable Long animalId) {
        return new ResponseEntity<>(healthCareService.getHealthCaresByAnimal(animalId), HttpStatus.OK);
    }

    @GetMapping("/next/animal/{animalId}")
    public ResponseEntity<HealthCare> getNextHealthCareForAnimal(@PathVariable Long animalId) {
        return new ResponseEntity<>(healthCareService.getNextAnimalHealthCare(animalId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<HealthCare> addHealthCare(@Valid @RequestBody HealthCareRequestDTO request) {
        return new ResponseEntity<>(healthCareService.addHealthCare(request), HttpStatus.CREATED);
    }
}
