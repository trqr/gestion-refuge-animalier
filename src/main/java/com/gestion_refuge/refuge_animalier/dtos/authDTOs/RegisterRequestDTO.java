package com.gestion_refuge.refuge_animalier.dtos.authDTOs;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RegisterRequestDTO {
    @NotBlank(message = "Le nom d'utilisateur ne peut pas etre vide.")
    private String username;
    @Email(message = "L'adresse email est invalide.")
    @NotBlank(message = "L'adresse email ne peut pas etre vide.")
    private String email;
    @NotBlank(message = "Le mot de passe ne peut pas être vide.")
    @Pattern(
            regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&._-])[A-Za-z\\d@$!%*?&._-]{8,}$",
            message = "Le mot de passe doit contenir au moins 8 caractères, avec au moins une majuscule, une minuscule, un chiffre et un caractère spécial."
    )
    private String password;
}
