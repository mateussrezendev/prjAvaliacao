package com.mateus.auth.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "itemPedido")
public class ItemPedido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "quantidade")
	private String quantidade;
	
	@Column(name = "valorunitario")
	private double valorunitario;
	
	@ManyToOne
	@JoinColumn(name = "id_pedido")
	private int id_pedido;
	
	@Column(name = "id_produto")
	private int id_produto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	public double getValorunitario() {
		return valorunitario;
	}

	public void setValorunitario(double valorunitario) {
		this.valorunitario = valorunitario;
	}
	
	public int getId_pedido() {
		return id_pedido;
	}

	public void setId_pedido(int id_pedido) {
		this.id_pedido = id_pedido;
	}
	
	public int getId_Produto() {
		return id_produto;
	}

	public void setId_produto(int id_produto) {
		this.id_produto = id_produto;
	}
}