package com.gestion_refuge.refuge_animalier.entities;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class User {
    private String username;
    private String password;
}
