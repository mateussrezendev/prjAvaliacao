package com.mateus.auth.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mateus.auth.entities.Fornecedor;
import com.mateus.auth.repositories.FornecedorRepository;

@Service
public class FornecedorService {
    private final FornecedorRepository fornecedorRepository;

    public FornecedorService(FornecedorRepository fornecedorRepository) {
        this.fornecedorRepository = fornecedorRepository;
    }

    public Fornecedor saveFornecedor(Fornecedor fornecedor) {
        return fornecedorRepository.save(fornecedor);
    }

    public Fornecedor getFornecedorById(Long id) {
        return fornecedorRepository.findById(id).orElse(null);
    }

    public List<Fornecedor> getAllFornecedors() {
        return fornecedorRepository.findAll();
    }

    public void deleteFornecedor(Long id) {
        fornecedorRepository.deleteById(id);
    }
}