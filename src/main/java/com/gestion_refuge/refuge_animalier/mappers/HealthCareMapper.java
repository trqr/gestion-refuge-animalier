package com.gestion_refuge.refuge_animalier.mappers;

import com.gestion_refuge.refuge_animalier.dtos.healthCareDTOs.HealthCareRequestDTO;
import com.gestion_refuge.refuge_animalier.entities.Animal;
import com.gestion_refuge.refuge_animalier.entities.HealthCare;
import com.gestion_refuge.refuge_animalier.entities.Veterinarian;
import org.springframework.stereotype.Component;

@Component
public class HealthCareMapper {

    public HealthCare DtoToEntity(HealthCareRequestDTO request, Animal animal, Veterinarian vet){
        HealthCare entity = new HealthCare();
        entity.setType(request.getType());
        entity.setDate(request.getDate());
        entity.setDescription(request.getDescription());
        entity.setAnimal(animal);
        entity.setVeterinarian(vet);
        return entity;
    }
}
