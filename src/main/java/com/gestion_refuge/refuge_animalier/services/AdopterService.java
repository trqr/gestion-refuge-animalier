package com.gestion_refuge.refuge_animalier.services;

import com.gestion_refuge.refuge_animalier.dtos.AdoptionRequestDTO;
import com.gestion_refuge.refuge_animalier.entities.Adopter;
import com.gestion_refuge.refuge_animalier.repositories.AdopterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdopterService {

    @Autowired
    private AdopterRepository adopterRepository;

    public List<Adopter> getAllAdopters() {
        return adopterRepository.findAll();
    }

    public Adopter getAdopterById(Long id) {
        return adopterRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Adopter with id " + id + " not found"));
    }

    public Adopter saveAdopter(AdoptionRequestDTO requestDTO) {
        Adopter created = new Adopter();

        created.setName( requestDTO.getName() );
        created.setEmail( requestDTO.getEmail() );
        created.setPhone( requestDTO.getPhone() );
        created.setAddress( requestDTO.getAddress() );

        return adopterRepository.save(created);
    }
}
