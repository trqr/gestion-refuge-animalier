package com.gestion_refuge.refuge_animalier.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String type;
    private String race;
    private String sex;
    private LocalDate birthDate;
    private LocalDate arrivalDate = LocalDate.now();
    private String behaviour;
    private String health;
    private String picture;
    @ManyToOne
    @JsonBackReference
    private Box box;
    private boolean isAdopted = false;
}
