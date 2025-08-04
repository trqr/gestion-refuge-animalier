package com.gestion_refuge.refuge_animalier.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Box {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String type;
    private int capacity;
    private String address;
    @OneToMany(mappedBy = "box")
    @JsonManagedReference
    private List<Animal> animals;
}
