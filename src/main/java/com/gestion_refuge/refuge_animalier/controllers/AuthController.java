package com.gestion_refuge.refuge_animalier.controllers;

import com.gestion_refuge.refuge_animalier.dtos.authDTOs.LoginRequestDTO;
import com.gestion_refuge.refuge_animalier.dtos.authDTOs.LoginResponseDTO;
import com.gestion_refuge.refuge_animalier.dtos.authDTOs.RegisterRequestDTO;
import com.gestion_refuge.refuge_animalier.dtos.authDTOs.UserDTO;
import com.gestion_refuge.refuge_animalier.services.AuthService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<UserDTO> register(@Valid @RequestBody RegisterRequestDTO request){
        return new ResponseEntity<>(authService.register(request), HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDTO> login(@Valid @RequestBody LoginRequestDTO request){
        return new ResponseEntity<>(authService.login(request), HttpStatus.OK);
    }

}
