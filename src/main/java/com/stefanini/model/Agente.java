package com.stefanini.model;

import java.io.Serializable;
import java.util.Date;

public class Agente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nome;
	private Date dataContratacao;
	private int tempoServico;
	private int id;

	public void setNome(String nome) {

		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public int getTempoServico() {
		return tempoServico;
	}

	public void setTempoServico(int tempoServico) {
		this.tempoServico = tempoServico;
	}

	public Date getDataContratacao() {
		return dataContratacao;
	}

	public void setDataContratacao(Date dataContratacao) {
		this.dataContratacao = dataContratacao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
