package com.gestion_refuge.refuge_animalier.mappers;

import com.gestion_refuge.refuge_animalier.dtos.authDTOs.RegisterRequestDTO;
import com.gestion_refuge.refuge_animalier.dtos.authDTOs.UserDTO;
import com.gestion_refuge.refuge_animalier.entities.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User registerRequestToUser(RegisterRequestDTO requestDTO){
        User created = new User();
        created.setUsername(requestDTO.getUsername());
        created.setEmail(requestDTO.getEmail());
        created.setPassword(requestDTO.getPassword());
        return created;
    }

    public UserDTO registerUserToResponse(User user){
        UserDTO responseDTO = new UserDTO(user.getUsername(), user.getEmail());
        return responseDTO;
    }
}
