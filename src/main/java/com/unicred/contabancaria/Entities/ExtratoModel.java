package com.unicred.contabancaria.Entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "tb_extrato")
public class ExtratoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idExtrato;

	@Column(nullable = false)
	private String operacao;

	@Column
	@CreationTimestamp
	private LocalDateTime dataHoraMovimento;

	@Column(nullable = false, columnDefinition = "DECIMAL(11,2)")
	private double valorOperacao;

	@ManyToOne
	@JoinColumn(name = "idContaCorrente")
	private ContaCorrenteModel contaCorrente;

	// Construtores
	public ExtratoModel() {
		super();
	}

	public ExtratoModel(String operacao, LocalDateTime dataHoraMovimento, double valorOperacao,
			ContaCorrenteModel contaCorrente) {
		super();
		this.operacao = operacao;
		this.dataHoraMovimento = dataHoraMovimento;
		this.valorOperacao = valorOperacao;
		this.contaCorrente = contaCorrente;
	}

	// Getters e Setters
	public Integer getIdExtrato() {
		return idExtrato;
	}

	public void setIdExtrato(Integer idExtrato) {
		this.idExtrato = idExtrato;
	}

	public String getOperacao() {
		return operacao;
	}

	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}

	public LocalDateTime getDataHoraMovimento() {
		return dataHoraMovimento;
	}

	public void setDataHoraMovimento(LocalDateTime dataHoraMovimento) {
		this.dataHoraMovimento = dataHoraMovimento;
	}

	public double getValorOperacao() {
		return valorOperacao;
	}

	public void setValorOperacao(double valorOperacao) {
		this.valorOperacao = valorOperacao;
	}

	public ContaCorrenteModel getContaCorrente() {
		return contaCorrente;
	}

	public void setContaCorrente(ContaCorrenteModel contaCorrente) {
		this.contaCorrente = contaCorrente;
	}

}
