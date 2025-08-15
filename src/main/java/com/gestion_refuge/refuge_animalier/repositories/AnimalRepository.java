package com.gestion_refuge.refuge_animalier.repositories;

import com.gestion_refuge.refuge_animalier.entities.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
    @Query("SELECT MONTH(a.arrivalDate) AS month, COUNT(a) AS count " +
            "FROM Animal a GROUP BY MONTH(a.arrivalDate)")
    List<Object[]> countArrivalsByMonth();

    Long countByIsAdopted(boolean isAdopted);

    List<Animal> findByIsAdopted(boolean isAdopted);
}
