package com.gestion_refuge.refuge_animalier.dtos;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BoxRequestDTO {
    @NotBlank(message = "Le nom du box ne peut pas etre vide.")
    private String name;
    @NotBlank(message = "Le type du box ne peut pas etre vide.")
    private String type;
    @Min(value = 1, message = "Le capacité du box doit être entre 1 et 10.")
    @Max(value = 10, message = "Le capacité du box doit être entre 1 et 10.")
    private int capacity;
    @NotBlank(message = "L'adresse du box ne peut pas etre vide.")
    private String address;
}
