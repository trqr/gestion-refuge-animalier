package com.gestion_refuge.refuge_animalier.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BoxAvaibilityResponseDTO {
    private Long id;
    private String name;
    private Integer capacity;
    private Long occupied;
    private Long available;
}
