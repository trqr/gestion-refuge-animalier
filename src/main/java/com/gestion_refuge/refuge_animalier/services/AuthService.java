package com.gestion_refuge.refuge_animalier.services;

import com.gestion_refuge.refuge_animalier.dtos.authDTOs.LoginRequestDTO;
import com.gestion_refuge.refuge_animalier.dtos.authDTOs.LoginResponseDTO;
import com.gestion_refuge.refuge_animalier.dtos.authDTOs.RegisterRequestDTO;
import com.gestion_refuge.refuge_animalier.dtos.authDTOs.UserDTO;
import com.gestion_refuge.refuge_animalier.entities.User;
import com.gestion_refuge.refuge_animalier.mappers.UserMapper;
import com.gestion_refuge.refuge_animalier.repositories.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public UserDTO register(RegisterRequestDTO request) {
        if (userRepository.existsByEmail(request.getEmail())){
            throw new RuntimeException("Email already exists");
        }

        request.setPassword(passwordEncoder.encode(request.getPassword()));
        User created = userRepository.save(userMapper.registerRequestToUser(request));

        return userMapper.registerUserToResponse(created);
    }

    public LoginResponseDTO login(LoginRequestDTO request) {
        return new LoginResponseDTO(null, null);
    }
}
