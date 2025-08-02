package com.gestion_refuge.refuge_animalier.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class HealthCare {
    @Id
    @GeneratedValue
    private Long id;
    private String type;
    @ManyToOne
    private Veterinarian veterinarianId;
    private LocalDate date;
    private String description;
    @ManyToOne
    private Animal AnimalId;
}
