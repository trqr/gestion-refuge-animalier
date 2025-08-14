package com.gestion_refuge.refuge_animalier.services;

import com.gestion_refuge.refuge_animalier.dtos.authDTOs.LoginRequestDTO;
import com.gestion_refuge.refuge_animalier.dtos.authDTOs.LoginResponseDTO;
import com.gestion_refuge.refuge_animalier.dtos.authDTOs.RegisterRequestDTO;
import com.gestion_refuge.refuge_animalier.dtos.authDTOs.UserDTO;
import com.gestion_refuge.refuge_animalier.entities.User;
import com.gestion_refuge.refuge_animalier.mappers.UserMapper;
import com.gestion_refuge.refuge_animalier.repositories.UserRepository;
import com.gestion_refuge.refuge_animalier.security.JwtUtil;
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

    @Autowired
    private JwtUtil jwtUtil;

    public UserDTO register(RegisterRequestDTO request) {
        if (userRepository.existsByEmail(request.getEmail())){
            throw new RuntimeException("Email already exists");
        }

        request.setPassword(passwordEncoder.encode(request.getPassword()));
        User created = userRepository.save(userMapper.registerRequestToUser(request));

        return userMapper.userToResponse(created);
    }

    public LoginResponseDTO login(LoginRequestDTO request) {
        User user = userRepository.findByEmail(request.getEmail())
                .orElseThrow( () -> new RuntimeException("Email or password incorrect"));

        if (passwordEncoder.matches(request.getPassword(), user.getPassword())){
            String token = jwtUtil.generateToken(user.getEmail());
            UserDTO userResponse = userMapper.userToResponse(user);
            return new LoginResponseDTO(token, userResponse);
        } else {
            throw new RuntimeException("Email or password incorrect");
        }
    }
}
