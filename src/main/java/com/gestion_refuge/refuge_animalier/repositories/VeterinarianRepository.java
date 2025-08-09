package com.gestion_refuge.refuge_animalier.repositories;

import com.gestion_refuge.refuge_animalier.entities.Veterinarian;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeterinarianRepository extends JpaRepository<Veterinarian, Long> {
}
