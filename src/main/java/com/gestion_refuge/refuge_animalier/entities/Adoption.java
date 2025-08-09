package com.gestion_refuge.refuge_animalier.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Adoption {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String status = "terminé";
    private LocalDate date = LocalDate.now();
    @ManyToOne
    private Animal animal;
    @ManyToOne
    private Adopter adopter;
}
