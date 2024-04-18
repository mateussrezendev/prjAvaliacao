package com.mateus.auth.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mateus.auth.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	
}