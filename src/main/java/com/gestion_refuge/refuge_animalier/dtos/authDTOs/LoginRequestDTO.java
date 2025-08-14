package com.gestion_refuge.refuge_animalier.dtos.authDTOs;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LoginRequestDTO {
    @NotBlank(message = "L'adresse email ne peut pas etre vide.")
    private String email;
    @NotBlank(message = "Le mot de passe ne peut pas etre vide.")
    private String password;
}
