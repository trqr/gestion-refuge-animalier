package com.gestion_refuge.refuge_animalier.repositories;

import com.gestion_refuge.refuge_animalier.entities.User;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByEmail(String email);
}
