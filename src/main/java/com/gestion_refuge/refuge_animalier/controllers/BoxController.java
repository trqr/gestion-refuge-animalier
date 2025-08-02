package com.gestion_refuge.refuge_animalier.controllers;

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
    public ResponseEntity<Integer> getBoxById(@PathVariable Long boxId) {
        return ResponseEntity.ok(0);
    }

    @GetMapping("/total")
    public ResponseEntity<Integer> getNumberOfBoxes() {
        return ResponseEntity.ok(0);
    }

    @GetMapping("/empty")
    public ResponseEntity<Integer> getNumberOfEmptyBoxes() {
        return ResponseEntity.ok(0);
    }
}
