package com.gestion_refuge.refuge_animalier.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

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
    private LocalDate arrivalDate;
    private String behaviour;
    private String health;
    private String picture;
    @ManyToOne
    private Box boxId;
}
