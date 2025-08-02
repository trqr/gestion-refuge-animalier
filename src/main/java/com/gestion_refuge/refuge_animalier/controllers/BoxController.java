package com.gestion_refuge.refuge_animalier.controllers;

import com.gestion_refuge.refuge_animalier.dtos.BoxAvaibilityResponseDTO;
import com.gestion_refuge.refuge_animalier.entities.Box;
import com.gestion_refuge.refuge_animalier.services.BoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/boxes")
public class BoxController {

    @Autowired
    private BoxService boxService;

    @GetMapping
    public ResponseEntity<List<Box>> getAllBoxes() {
        return new ResponseEntity<>(boxService.getAllBoxes(), HttpStatus.OK);
    }

    @GetMapping("/{boxId}")
    public ResponseEntity<Box> getBoxById(@PathVariable Long boxId) {
        return new ResponseEntity<>(boxService.getBoxById(boxId), HttpStatus.OK);
    }

    @GetMapping("/total")
    public ResponseEntity<Long> getNumberOfBoxes() {
        return new ResponseEntity<>(boxService.getNumberOfBoxes(), HttpStatus.OK);
    }

    @GetMapping("/usedNb")
    public ResponseEntity<Long> getNumberOfUsedBoxes() {
        return new ResponseEntity<>(boxService.getNumberOfUsedBoxes(), HttpStatus.OK);
    }

    @GetMapping("/avaibility")
    public ResponseEntity<List<BoxAvaibilityResponseDTO>> getBoxesAvailability(){
        return new ResponseEntity<>(boxService.getBoxesAvailability(), HttpStatus.OK);
    }
}
