package com.gestion_refuge.refuge_animalier.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Adopter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String phone;
    private String email;
    @OneToMany(mappedBy = "adopter")
    @JsonBackReference
    private List<Adoption> adoptions;
}
