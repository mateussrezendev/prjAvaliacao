package com.mateus.auth.entities;

import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedido")
public class Pedido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "datapedido")
	private Date datapedido;

	@Column(name = "valortotal")
	private Double valortotal;

	@ManyToOne
	@JoinColumn(name = "id_cliente")
	private int id_cliente;
	
	@ManyToOne
	@JoinColumn(name = "id_fornecedor")
	private int id_fornecedor;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDatapedido() {
		return datapedido;
	}

	public void setDatapedido(Date datapedido) {
		this.datapedido = datapedido;
	}

	public Double getValortotal() {
		return valortotal;
	}

	public void setValortotal(Double valortotal) {
		this.valortotal = valortotal;
	}
	
	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	
	public int getId_fornecedor() {
		return id_fornecedor;
	}

	public void setId_fornecedor(int id_fornecedor) {
		this.id_fornecedor = id_fornecedor;
	}
}