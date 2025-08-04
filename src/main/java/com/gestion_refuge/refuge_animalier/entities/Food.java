package com.gestion_refuge.refuge_animalier.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private int quantity;
    private String frequency;
    private String description;
    @ManyToOne
    private Animal animal;
}
