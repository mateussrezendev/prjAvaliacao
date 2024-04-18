package com.mateus.auth.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mateus.auth.entities.ItemPedido;
import com.mateus.auth.services.ItemPedidoService;

@RestController
@RequestMapping("/itempedido")

public class ItemPedidoController {
    private final ItemPedidoService itempedidoService;

    public ItemPedidoController(ItemPedidoService itempedidoService) {
        this.itempedidoService = itempedidoService;
    }

    @PostMapping
    public ItemPedido createProduct(@RequestBody ItemPedido itempedido) {
        return itempedidoService.saveItemPedido(itempedido);
    }

    @GetMapping("/{id}")
    public ItemPedido getItemPedido(@PathVariable Long id) {
        return itempedidoService.getItemPedidoById(id);
    }

    @GetMapping
    public List<ItemPedido> getAllItemPedidos() {
        return itempedidoService.getAllItemPedidos();
    }

    @DeleteMapping("/{id}")
    public void deleteItemPedido(@PathVariable Long id) {
        itempedidoService.deleteItemPedido(id);
    }
}
