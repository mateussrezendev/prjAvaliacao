package com.mateus.auth.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mateus.auth.entities.Cliente;
import com.mateus.auth.repositories.ClienteRepository;

@Service
public class ClienteService {
    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente saveCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Cliente getClienteById(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    public List<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }

    public void deleteCliente(Long id) {
        clienteRepository.deleteById(id);
    }
}