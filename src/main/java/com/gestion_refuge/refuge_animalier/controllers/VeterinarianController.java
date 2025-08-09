package com.gestion_refuge.refuge_animalier.controllers;

import com.gestion_refuge.refuge_animalier.entities.Veterinarian;
import com.gestion_refuge.refuge_animalier.services.VeterinarianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/veterinarian")
public class VeterinarianController {

    @Autowired
    private VeterinarianService veterinarianService;

    @GetMapping
    public ResponseEntity<List<Veterinarian>> getVeterinarian(){
        return new ResponseEntity<>(veterinarianService.getAllVet(), HttpStatus.OK);
    }
}
