package com.unicred.contabancaria.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_agencia")
public class AgenciaModel {

	@Id // Gerador de ID automatico
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idAgencia;

	// Valores armazenados não podem ser nulos
	@Column(nullable = false)
	private String nomeAgencia;

	@Column(nullable = false)
	private String endereco;

	@Column(nullable = false)
	private String telefone;

	// Construtores
	public AgenciaModel() {
		super();
	}

	public AgenciaModel(String nomeAgencia, String endereco, String telefone) {
		super();
		this.nomeAgencia = nomeAgencia;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	// Getters e Setters
	public Integer getIdAgencia() {
		return idAgencia;
	}

	public void setIdAgencia(Integer idAgencia) {
		this.idAgencia = idAgencia;
	}

	public String getNomeAgencia() {
		return nomeAgencia;
	}

	public void setNomeAgencia(String nomeAgencia) {
		this.nomeAgencia = nomeAgencia;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
