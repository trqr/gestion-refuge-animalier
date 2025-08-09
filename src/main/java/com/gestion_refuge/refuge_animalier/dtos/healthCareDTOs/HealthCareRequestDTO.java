package com.gestion_refuge.refuge_animalier.dtos.healthCareDTOs;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class HealthCareRequestDTO {
    @NotBlank(message = "Le type de soin ne peut pas être vide.")
    private String type;
    @NotBlank(message = "La date du soin ne peut pas être vide.")
    private LocalDate date;
    @NotBlank(message = "La description du soin ne peut pas être vide.")
    @Length(min = 10, message = "La description doit avoir au moins 10 caractères.")
    private String description;
    @NotNull(message = "l'id du vétérinaire peut pas être null.")
    private Long vetId;
    @NotNull(message = "l'id de l'animal ne peut pas être null.")
    private Long animalId;
}
