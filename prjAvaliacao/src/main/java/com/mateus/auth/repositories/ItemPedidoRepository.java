package com.mateus.auth.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mateus.auth.entities.ItemPedido;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Long> {
	
}