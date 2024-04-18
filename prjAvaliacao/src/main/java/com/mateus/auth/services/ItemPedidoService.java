package com.mateus.auth.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mateus.auth.entities.ItemPedido;
import com.mateus.auth.repositories.ItemPedidoRepository;

@Service
public class ItemPedidoService {
    private final ItemPedidoRepository itempedidoRepository;

    public ItemPedidoService(ItemPedidoRepository itempedidoRepository) {
        this.itempedidoRepository = itempedidoRepository;
    }

    public ItemPedido saveItemPedido(ItemPedido itempedido) {
        return itempedidoRepository.save(itempedido);
    }

    public ItemPedido getItemPedidoById(Long id) {
        return itempedidoRepository.findById(id).orElse(null);
    }

    public List<ItemPedido> getAllItemPedidos() {
        return itempedidoRepository.findAll();
    }

    public void deleteItemPedido(Long id) {
        itempedidoRepository.deleteById(id);
    }
}