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
@Table(name = "tb_conta_corrente")
public class ContaCorrenteModel {

	@Id // Gerador de ID Automatico
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idContaCorrente;

	@Column(columnDefinition = "DECIMAL(11,2) DEFAULT 0.00")
	private double saldoContaCorrente = 0.00;

	@ManyToOne // Chave Estrangeira da tabela TitularModel
	@JoinColumn(name = "idTitular", nullable = false)
	private TitularModel titular;

	// Construtores
	public ContaCorrenteModel() {
		super();
	}

	public ContaCorrenteModel(double saldoContaCorrente, TitularModel titular) {
		super();
		this.saldoContaCorrente = saldoContaCorrente;
		this.titular = titular;
	}

	// Getters e Setters
	public Integer getIdContaCorrente() {
		return idContaCorrente;
	}

	public void setIdContaCorrente(Integer idContaCorrente) {
		this.idContaCorrente = idContaCorrente;
	}

	public double getSaldoContaCorrente() {
		return saldoContaCorrente;
	}

	public void setSaldoContaCorrente(double saldoContaCorrente) {
		this.saldoContaCorrente = saldoContaCorrente;
	}

	public TitularModel getTitular() {
		return titular;
	}

	public void setTitular(TitularModel titular) {
		this.titular = titular;
	}

}
