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
@Table(name = "fornecedor")
public class Fornecedor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "cnpj")
	private String cnpj;
	
	@Column(name = "email")
	private String email;
	 
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "telefone")
	private String telefone;
	
	@ManyToOne
	@JoinColumn(name = "id_fornecedor")
	private int id_fornecedor;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getId_fornecedor() {
		return id_fornecedor;
	}
	public void setId_fornecedor(int id_fornecedor) {
		this.id_fornecedor = id_fornecedor;
	}
}