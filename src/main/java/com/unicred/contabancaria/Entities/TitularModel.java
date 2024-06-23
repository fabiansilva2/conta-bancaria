package com.unicred.contabancaria.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_titular")
public class TitularModel {

	@Id // Gerador de ID automatico
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTitular;

	@Column(nullable = false)
	private String titularNome;

	@Column(nullable = false, unique = true)
	private String titularCPF;

	@Column(nullable = false)
	private String titularFone;

	@Column(nullable = false)
	private String titularEndereco;

	@ManyToOne // Chave Estrangeira da tabela AgenciaModel
	@JoinColumn(name = "idAgencia", nullable = false)
	private AgenciaModel agencia;

	// Construtores
	public TitularModel() {
		super();
	}

	public TitularModel(String titularNome, String titularCPF, String titularFone, String titularEndereco,
			AgenciaModel agencia) {
		super();
		this.titularNome = titularNome;
		this.titularCPF = titularCPF;
		this.titularFone = titularFone;
		this.titularEndereco = titularEndereco;
		this.agencia = agencia;
	}

	// Getters e Setters
	public Integer getIdTitular() {
		return idTitular;
	}

	public void setIdTitular(Integer idTitular) {
		this.idTitular = idTitular;
	}

	public String getTitularNome() {
		return titularNome;
	}

	public void setTitularNome(String titularNome) {
		this.titularNome = titularNome;
	}

	public String getTitularCPF() {
		return titularCPF;
	}

	public void setTitularCPF(String titularCPF) {
		this.titularCPF = titularCPF;
	}

	public String getTitularFone() {
		return titularFone;
	}

	public void setTitularFone(String titularFone) {
		this.titularFone = titularFone;
	}

	public String getTitularEndereco() {
		return titularEndereco;
	}

	public void setTitularEndereco(String titularEndereco) {
		this.titularEndereco = titularEndereco;
	}

	public AgenciaModel getAgencia() {
		return agencia;
	}

	public void setAgencia(AgenciaModel agencia) {
		this.agencia = agencia;
	}

}
