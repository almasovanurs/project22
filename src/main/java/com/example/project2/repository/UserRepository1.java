package com.example.project2.repository;

import com.example.project2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository1 extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String  email);
}
