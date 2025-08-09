package com.gestion_refuge.refuge_animalier.services;

import com.gestion_refuge.refuge_animalier.dtos.healthCareDTOs.HealthCareRequestDTO;
import com.gestion_refuge.refuge_animalier.entities.Animal;
import com.gestion_refuge.refuge_animalier.entities.HealthCare;
import com.gestion_refuge.refuge_animalier.entities.Veterinarian;
import com.gestion_refuge.refuge_animalier.repositories.HealthCareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class HealthCareService {

    @Autowired
    private HealthCareRepository healthCareRepository;
    @Autowired
    private AnimalService animalService;
    @Autowired
    private VeterinarianService veterinarianService;

    public List<HealthCare> getAllHealthCares() {
        return healthCareRepository.findAll();
    }

    public List<HealthCare> getNextFiveHealthCares() {
        return healthCareRepository.findTop5ByDateAfterOrderByDateAsc(LocalDate.now());
    }

    public List<HealthCare> getHealthCaresByAnimal(Long animalId) {
        return healthCareRepository.findByAnimalIdOrderByDateAsc(animalId);
    }

    public HealthCare addHealthCare(HealthCareRequestDTO request) {
        Animal animal = animalService.getAnimalById(request.getAnimalId());
        Veterinarian vet = veterinarianService.getVeterinarianById(request.getVetId());

        HealthCare created = new HealthCare();
        created.setType(request.getType());
        created.setDate(request.getDate());
        created.setDescription(request.getDescription());
        created.setAnimal(animal);
        created.setVeterinarian(vet);

        return healthCareRepository.save(created);
    }
}
