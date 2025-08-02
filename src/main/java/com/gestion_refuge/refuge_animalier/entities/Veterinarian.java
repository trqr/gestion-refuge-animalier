package com.gestion_refuge.refuge_animalier.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Veterinarian {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String speciality;
    private String address;
    @OneToMany(mappedBy = "veterinarianId")
    private List<HealthCare> healthCares;
}
