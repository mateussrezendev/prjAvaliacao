package com.mateus.auth.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mateus.auth.entities.Produto;
import com.mateus.auth.repositories.ProdutoRepository;

@Service
public class ProdutoService {
    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public Produto saveProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    public Produto getProdutoById(Long id) {
        return produtoRepository.findById(id).orElse(null);
    }

    public List<Produto> getAllProdutos() {
        return produtoRepository.findAll();
    }

    public void deleteProduto(Long id) {
        produtoRepository.deleteById(id);
    }
}