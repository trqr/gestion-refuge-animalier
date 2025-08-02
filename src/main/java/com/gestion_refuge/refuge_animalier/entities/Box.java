package com.gestion_refuge.refuge_animalier.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Box {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String type;
    private int capacity;
    private String address;
    @OneToMany(mappedBy = "boxId")
    private List<Animal> animals;
}
