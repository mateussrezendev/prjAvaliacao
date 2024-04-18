package com.mateus.auth.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mateus.auth.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
}