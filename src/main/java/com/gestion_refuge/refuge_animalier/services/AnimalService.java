package com.gestion_refuge.refuge_animalier.services;

import com.gestion_refuge.refuge_animalier.dtos.AnimalRequestDTO;
import com.gestion_refuge.refuge_animalier.entities.Animal;
import com.gestion_refuge.refuge_animalier.entities.Box;
import com.gestion_refuge.refuge_animalier.exceptions.BoxFullException;
import com.gestion_refuge.refuge_animalier.repositories.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository animalRepository;
    @Autowired
    private BoxService boxService;

    public List<Animal> getAllAnimals() {
        return animalRepository.findAll();
    }

    public Animal getAnimalById(Long id) {
        return animalRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Animal " + id + " non trouvé"));
    }

    public Animal addAnimal(AnimalRequestDTO request) {
        Box newAnimalBox = boxService.getBoxById(request.getBoxId());

        Animal created = new Animal();
        created.setName(request.getName());
        created.setType(request.getType());
        created.setRace(request.getRace());
        created.setSex(request.getSex());
        created.setBirthDate(request.getBirthDate());
        created.setBehaviour(request.getBehaviour());
        created.setHealth(request.getHealth());
        created.setPicture(request.getPicture());
        created.setBox(newAnimalBox);

        return animalRepository.save(created);
    }

    public Long getNumberOfAnimals() {
        return animalRepository.countByIsAdopted(false);
    }

    public Animal changeBox(Long id, Long boxId) {
        Animal animal = getAnimalById(id);
        Box newBox = boxService.getBoxById(boxId);
        if (newBox.getCapacity() - newBox.getAnimals().size() <= 0){
            throw new BoxFullException("Le box est plein");
        }
        animal.setBox(newBox);
        return animalRepository.save(animal);
    }

    public Box getBoxByAnimalId(Long animalId) {
        return this.getAnimalById(animalId).getBox();
    }
}
