package com.gestion_refuge.refuge_animalier.repositories;

import com.gestion_refuge.refuge_animalier.dtos.BoxAvaibilityResponseDTO;
import com.gestion_refuge.refuge_animalier.entities.Animal;
import com.gestion_refuge.refuge_animalier.entities.Box;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BoxRepository extends JpaRepository<Box, Long> {
    @Query("SELECT COUNT(b) FROM Box b WHERE SIZE(b.animals) > 0")
    long countUsedBoxes();

    @Query(value = """
    SELECT 
        b.id AS id,
        b.name AS name,
        b.capacity AS capacity,
        COUNT(a.id) AS occupied,
        (b.capacity - COUNT(a.id)) AS available
    FROM box b
    LEFT JOIN animal a ON a.box_id = b.id
    GROUP BY b.id, b.name, b.capacity
""", nativeQuery = true)
    List<BoxAvaibilityResponseDTO> getBoxAvailability();
}
