package com.gestion_refuge.refuge_animalier.dtos.adoptionDTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdoptionsValidateRequest {

    List<Long> adoptionIds;

}
