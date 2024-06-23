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
@Table(name = "tb_conta_investimento")
public class ContaInvestimentoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idContaInvestimento;

	@Column(nullable = false)
	private String nomeInvestimento;

	@Column(nullable = false)
	private String descricaoInvestimento;

	@ManyToOne
	@JoinColumn(name = "idContaCorrente")
	private ContaCorrenteModel contaCorrente;

	// Construtores
	public ContaInvestimentoModel() {
		super();
	}

	public ContaInvestimentoModel(String nomeInvestimento, String descricaoInvestimento,
			ContaCorrenteModel contaCorrente) {
		super();
		this.nomeInvestimento = nomeInvestimento;
		this.descricaoInvestimento = descricaoInvestimento;
		this.contaCorrente = contaCorrente;
	}

	// Getters e Setters
	public Integer getIdContaInvestimento() {
		return idContaInvestimento;
	}

	public void setIdContaInvestimento(Integer idContaInvestimento) {
		this.idContaInvestimento = idContaInvestimento;
	}

	public String getNomeInvestimento() {
		return nomeInvestimento;
	}

	public void setNomeInvestimento(String nomeInvestimento) {
		this.nomeInvestimento = nomeInvestimento;
	}

	public String getDescricaoInvestimento() {
		return descricaoInvestimento;
	}

	public void setDescricaoInvestimento(String descricaoInvestimento) {
		this.descricaoInvestimento = descricaoInvestimento;
	}

	public ContaCorrenteModel getContaCorrente() {
		return contaCorrente;
	}

	public void setContaCorrente(ContaCorrenteModel contaCorrente) {
		this.contaCorrente = contaCorrente;
	}

}
