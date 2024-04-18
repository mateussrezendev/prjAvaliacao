package com.mateus.auth.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mateus.auth.entities.Pedido;
import com.mateus.auth.services.PedidoService;

@RestController
@RequestMapping("/pedido")

public class PedidoController {
    private final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @PostMapping
    public Pedido createProduct(@RequestBody Pedido pedido) {
        return pedidoService.savePedido(pedido);
    }

    @GetMapping("/{id}")
    public Pedido getPedido(@PathVariable Long id) {
        return pedidoService.getPedidoById(id);
    }

    @GetMapping
    public List<Pedido> getAllPedidos() {
        return pedidoService.getAllPedidos();
    }

    @DeleteMapping("/{id}")
    public void deletePedido(@PathVariable Long id) {
        pedidoService.deletePedido(id);
    }
}
