package com.gestion_refuge.refuge_animalier.services;

import com.gestion_refuge.refuge_animalier.dtos.BoxAvaibilityResponseDTO;
import com.gestion_refuge.refuge_animalier.dtos.BoxRequestDTO;
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

    public Box getBoxById(Long boxId) {
        return boxRepository.findById(boxId)
                .orElseThrow(() -> new RuntimeException("Box with id " + boxId + " not found"));
    }

    public Long getNumberOfBoxes() {
        return boxRepository.count();
    }

    public Long getNumberOfUsedBoxes(){
        return boxRepository.countUsedBoxes();
    }

    public List<BoxAvaibilityResponseDTO> getBoxesAvailability(){
        return boxRepository.getBoxAvailability();
    }

    public Box createBox(BoxRequestDTO request) {

        Box created = new Box();
        created.setName(request.getName());
        created.setType(request.getType());
        created.setCapacity(request.getCapacity());
        created.setAddress(request.getAddress());

        return boxRepository.save(created);
    }
}
