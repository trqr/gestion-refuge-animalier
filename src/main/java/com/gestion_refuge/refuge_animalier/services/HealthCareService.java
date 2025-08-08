package com.gestion_refuge.refuge_animalier.services;

import com.gestion_refuge.refuge_animalier.entities.HealthCare;
import com.gestion_refuge.refuge_animalier.repositories.HealthCareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class HealthCareService {

    @Autowired
    private HealthCareRepository healthCareRepository;

    public List<HealthCare> getAllHealthCares() {
        return healthCareRepository.findAll();
    }

    public List<HealthCare> getNextFiveHealthCares() {
        return healthCareRepository.findTop5ByDateAfterOrderByDateAsc(LocalDate.now());
    }

    public List<HealthCare> getHealthCaresByAnimal(Long animalId) {
        return healthCareRepository.findByAnimalIdOrderByDateAsc(animalId);
    }
}
