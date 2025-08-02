package com.gestion_refuge.refuge_animalier.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Food {
    @Id
    @GeneratedValue
    private Long id;
    private String type;
    private int quantity;
    private String frequency;
    private String description;
    @ManyToOne
    private Animal animalId;
}
