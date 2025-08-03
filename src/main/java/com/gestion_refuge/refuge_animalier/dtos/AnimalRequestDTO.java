package com.gestion_refuge.refuge_animalier.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.validator.constraints.URL;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class AnimalRequestDTO {
    @NotBlank(message = "Le nom de l'animal ne peut pas etre vide.")
    private String name;
    @NotBlank(message = "Le type de l'animal ne peut pas etre vide.")
    private String type;
    @NotBlank(message = "La race de l'animal ne peut pas etre vide.")
    private String race;
    @NotBlank(message = "Le sexe de l'animal ne peut pas etre vide.")
    private String sex;
    private LocalDate birthDate;
    private String behaviour;
    private String health;
    @URL(message = "L'url de l'image ne correspond pas au format.")
    private String picture;
    @NotNull(message = "Le boxId ne peut pas etre vide.")
    private Long boxId;
}
