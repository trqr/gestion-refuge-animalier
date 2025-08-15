package com.gestion_refuge.refuge_animalier.controllers;

import com.gestion_refuge.refuge_animalier.dtos.adoptionDTOs.AdoptionRequestDTO;
import com.gestion_refuge.refuge_animalier.dtos.adoptionDTOs.AdoptionsValidateRequest;
import com.gestion_refuge.refuge_animalier.entities.Adopter;
import com.gestion_refuge.refuge_animalier.entities.Adoption;
import com.gestion_refuge.refuge_animalier.services.AdopterService;
import com.gestion_refuge.refuge_animalier.services.AdoptionService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/adoption")
public class AdoptionController {

    @Autowired
    private AdoptionService adoptionService;
    @Autowired
    private AdopterService adopterService;

    @GetMapping
    public ResponseEntity<List<Adoption>> getAllAdoptions(){
        return new ResponseEntity<>(adoptionService.getAllAdoptions(), HttpStatus.OK);
    }

    @GetMapping("/last-month")
    public ResponseEntity<List<Adoption>> getLastMonthAdoptions(){
        return new ResponseEntity<>(adoptionService.getAdoptionsLast30Days(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Adoption> createAdoption(@Valid @RequestBody AdoptionRequestDTO requestDTO){

        Adopter newAdopter = adopterService.saveAdopter(requestDTO);

        return new ResponseEntity<>(adoptionService.saveAdoption(newAdopter, requestDTO.getAnimalId()), HttpStatus.CREATED);
    }

    @GetMapping("/last-5")
    public ResponseEntity<List<Adoption>> getLast5Adoptions(){
        return new ResponseEntity<>(adoptionService.getLast5(), HttpStatus.OK);
    }

    @PatchMapping
    public ResponseEntity<List<Adoption>> validateAdoptions(@RequestBody AdoptionsValidateRequest request){
        return new ResponseEntity<>(adoptionService.validateAdoptions(request.getAdoptionIds()), HttpStatus.OK);
    }

    @PatchMapping("/cancel")
    public ResponseEntity<List<Adoption>> cancelAdoptions(@RequestBody AdoptionsValidateRequest request){
        return new ResponseEntity<>(adoptionService.cancelAdoptions(request.getAdoptionIds()), HttpStatus.OK);
    }
}
