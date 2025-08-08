package com.gestion_refuge.refuge_animalier.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class HealthCare {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    @ManyToOne
    @JsonManagedReference
    private Veterinarian veterinarian;
    private LocalDate date;
    private String description;
    @ManyToOne
    @JoinColumn(name = "animal_id")
    private Animal animal;
}
