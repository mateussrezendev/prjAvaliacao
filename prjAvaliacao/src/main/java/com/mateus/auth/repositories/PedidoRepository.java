package com.mateus.auth.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mateus.auth.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
	
}