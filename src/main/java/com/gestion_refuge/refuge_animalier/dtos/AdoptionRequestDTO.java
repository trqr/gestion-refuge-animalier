package com.gestion_refuge.refuge_animalier.dtos;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.gestion_refuge.refuge_animalier.entities.Adopter;
import com.gestion_refuge.refuge_animalier.entities.Animal;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class AdoptionRequestDTO {
    @NotNull(message = "Le ID de l'animal ne peut pas etre null.")
    private Long animalId;
    @NotBlank(message = "Le nom de l'adopteur ne peut pas etre vide.")
    private String name;
    @NotBlank(message = "L'adresse de l'adopteur ne peut pas etre vide.")
    private String address;
    @NotBlank(message = "Le numero de telephone de l'adopteur ne peut pas etre vide.")
    private String phone;
    @NotBlank(message = "L'email de l'adopteur ne peut pas etre vide.")
    private String email;
}
