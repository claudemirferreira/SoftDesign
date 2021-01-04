package br.com.claudemir.SoftDesign.domain;

import java.io.Serializable;

public class Pauta implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	private String nome;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Pauta() {}

	public Pauta(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
	}

}