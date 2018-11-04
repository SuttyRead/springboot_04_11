package com.ua.sutty.springboot.repository;

import com.ua.sutty.springboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findOneByUsername(String login);
}

