package com.gestion_refuge.refuge_animalier.repositories;

import com.gestion_refuge.refuge_animalier.entities.Adoption;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface AdoptionRepository extends JpaRepository<Adoption, Long> {

    List<Adoption> findByDateAfterOrderByDateAsc(LocalDate date);

    List<Adoption> findTop5ByDateBeforeOrderByDateDesc(LocalDate date);

    @Query("SELECT MONTH(ad.date) AS month, COUNT(ad) AS count " +
            "FROM Adoption ad GROUP BY MONTH(ad.date)")
    List<Object[]> countAdoptionsByMonth();

}
