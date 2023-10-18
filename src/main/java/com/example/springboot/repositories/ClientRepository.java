package com.example.springboot.repositories;

import com.example.springboot.models.ClientModel;
import com.example.springboot.models.ClientRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import com.example.springboot.models.ProductModel;

import java.util.UUID;

@Repository
public interface ClientRepository extends JpaRepository<ClientModel, Long> {
    UserDetails findByLogin(String login);
}

