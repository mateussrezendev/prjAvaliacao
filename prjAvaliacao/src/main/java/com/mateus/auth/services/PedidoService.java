package com.mateus.auth.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mateus.auth.entities.Pedido;
import com.mateus.auth.repositories.PedidoRepository;

@Service
public class PedidoService {
    private final PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public Pedido savePedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    public Pedido getPedidoById(Long id) {
        return pedidoRepository.findById(id).orElse(null);
    }

    public List<Pedido> getAllPedidos() {
        return pedidoRepository.findAll();
    }

    public void deletePedido(Long id) {
        pedidoRepository.deleteById(id);
    }
}