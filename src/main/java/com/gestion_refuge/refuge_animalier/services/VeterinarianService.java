package com.gestion_refuge.refuge_animalier.services;

import com.gestion_refuge.refuge_animalier.entities.Veterinarian;
import com.gestion_refuge.refuge_animalier.repositories.VeterinarianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeterinarianService {

    @Autowired
    private VeterinarianRepository veterinarianRepository;

    public List<Veterinarian> getAllVet() {
        return veterinarianRepository.findAll();
    }

    public Veterinarian getVeterinarianById(Long id) {
        return veterinarianRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Veterinarian with id " + id + " not found"));
    }


}
