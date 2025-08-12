package com.gestion_refuge.refuge_animalier.repositories;

import com.gestion_refuge.refuge_animalier.entities.HealthCare;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface HealthCareRepository extends JpaRepository<HealthCare, Long> {

    List<HealthCare> findTop5ByDateAfterOrderByDateAsc(LocalDate date);

    List<HealthCare> findByAnimalIdOrderByDateAsc(Long animalId);

    HealthCare findTop1ByAnimalIdAndDateAfter(Long animalId, LocalDate date);

}
