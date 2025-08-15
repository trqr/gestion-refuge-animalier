package com.gestion_refuge.refuge_animalier.controllers;

import com.gestion_refuge.refuge_animalier.dtos.AnimalRequestDTO;
import com.gestion_refuge.refuge_animalier.entities.Animal;
import com.gestion_refuge.refuge_animalier.entities.Box;
import com.gestion_refuge.refuge_animalier.services.AnimalService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.graphql.GraphQlProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @GetMapping
    public ResponseEntity<List<Animal>> getAllAnimals(){
        return new ResponseEntity<>(animalService.getAllAnimals(), HttpStatus.OK);
    }

    @GetMapping("/not-adopted")
    public ResponseEntity<List<Animal>> getNotAdoptedAnimals(){
        return new ResponseEntity<>(animalService.getNotAdoptedAnimals(), HttpStatus.OK);
    }

    @GetMapping("/total")
    public ResponseEntity<Long> getNumberOfAnimals(){
        return new ResponseEntity<>(animalService.getNumberOfAnimals(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Animal> getAnimalById(@PathVariable Long id){
        return new ResponseEntity<>(animalService.getAnimalById(id), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Animal> addAnimal(@Valid @RequestBody AnimalRequestDTO request){
        return new ResponseEntity<>(animalService.addAnimal(request), HttpStatus.CREATED);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Animal> changeBox(@Valid @PathVariable Long id, @RequestParam Long boxId ){
        return new ResponseEntity<>(animalService.changeBox(id, boxId), HttpStatus.OK);
    }

    @GetMapping("/getbox/{animalId}")
    public ResponseEntity<Box> getBoxByAnimalId(@PathVariable Long animalId){
        return new ResponseEntity<>(animalService.getBoxByAnimalId(animalId), HttpStatus.OK);
    }
}
