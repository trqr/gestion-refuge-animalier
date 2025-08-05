package com.gestion_refuge.refuge_animalier.services;

import com.gestion_refuge.refuge_animalier.entities.Animal;
import com.gestion_refuge.refuge_animalier.entities.Food;
import com.gestion_refuge.refuge_animalier.repositories.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {

    @Autowired
    private FoodRepository foodRepository;
    @Autowired
    private AnimalService animalService;

    public List<Food> getAllFoods() {
        return foodRepository.findAll();
    }

    public Food getFoodById(Long id) {
        return foodRepository.findById(id)
                .orElseThrow( () -> new RuntimeException("Food with id " + id + " not found"));
    }

    public List<Food> getFoodByAnimalId(Long animalId){
        Animal animal = animalService.getAnimalById(animalId);
        return foodRepository.findByAnimal(animal);
    }
}
