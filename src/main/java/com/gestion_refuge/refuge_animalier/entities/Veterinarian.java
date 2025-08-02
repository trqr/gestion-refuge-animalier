package com.gestion_refuge.refuge_animalier.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Veterinarian {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String speciality;
    private String address;
    @OneToMany(mappedBy = "veterinarianId")
    private List<HealthCare> healthCares;
}
