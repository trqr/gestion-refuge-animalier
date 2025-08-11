package com.gestion_refuge.refuge_animalier.services;

import com.gestion_refuge.refuge_animalier.entities.Adopter;
import com.gestion_refuge.refuge_animalier.entities.Adoption;
import com.gestion_refuge.refuge_animalier.entities.Animal;
import com.gestion_refuge.refuge_animalier.repositories.AdoptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AdoptionService {

    @Autowired
    private AdoptionRepository adoptionRepository;
    @Autowired
    private AnimalService animalService;

    public List<Adoption> getAllAdoptions() {
        return adoptionRepository.findAll();
    }

    public List<Adoption> getAdoptionsLast30Days() {
        LocalDate date30JoursAvant = LocalDate.now().minusDays(30);
        return adoptionRepository.findByDateAfterOrderByDateAsc(date30JoursAvant);
    }

    public Adoption saveAdoption(Adopter adopter, Long animalId) {
        Adoption created = new Adoption();
        Animal animal = animalService.getAnimalById(animalId);

        created.setAdopter(adopter);
        created.setAnimal(animal);
        created.setDate(LocalDate.now());
        created.setStatus("En cours");

        return adoptionRepository.save(created);
    }

    public List<Adoption> getLast5() {
        return adoptionRepository.findTop5ByDateBeforeOrderByDateDesc(LocalDate.now().plusDays(1));
    }
}
