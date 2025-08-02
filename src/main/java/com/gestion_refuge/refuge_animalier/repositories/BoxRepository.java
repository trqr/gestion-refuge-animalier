package com.gestion_refuge.refuge_animalier.repositories;

import com.gestion_refuge.refuge_animalier.entities.Box;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoxRepository extends JpaRepository<Box, Long> {
}
