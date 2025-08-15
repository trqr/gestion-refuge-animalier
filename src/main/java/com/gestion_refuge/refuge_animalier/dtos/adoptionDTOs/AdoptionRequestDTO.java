package com.gestion_refuge.refuge_animalier.dtos.adoptionDTOs;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

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
