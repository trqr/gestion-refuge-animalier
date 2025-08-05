package com.gestion_refuge.refuge_animalier.controllers;

import com.gestion_refuge.refuge_animalier.entities.Food;
import com.gestion_refuge.refuge_animalier.services.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @GetMapping
    public ResponseEntity<List<Food>> getAllFoods(){
        return new ResponseEntity<>(foodService.getAllFoods(), HttpStatus.OK);
    }

    @GetMapping("by-animal/{animalId}")
    public ResponseEntity<List<Food>> getFoodByAnimalId(@PathVariable Long animalId){
        return new ResponseEntity<>(foodService.getFoodByAnimalId(animalId), HttpStatus.OK);
    }
}
