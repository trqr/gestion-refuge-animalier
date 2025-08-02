package com.gestion_refuge.refuge_animalier.services;

import com.gestion_refuge.refuge_animalier.entities.Box;
import com.gestion_refuge.refuge_animalier.repositories.BoxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoxService {

    @Autowired
    private BoxRepository boxRepository;

    public List<Box> getAllBoxes() {
        return boxRepository.findAll();
    }
}
