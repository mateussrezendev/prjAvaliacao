package com.mateus.auth.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mateus.auth.entities.Fornecedor;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {
	
}