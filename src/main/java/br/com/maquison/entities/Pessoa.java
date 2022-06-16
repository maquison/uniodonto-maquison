package br.com.maquison.entities;

import java.util.Calendar;

public abstract class Pessoa {
	private String nome;
	private Calendar nascimento;
	
	public Pessoa(String nome, Calendar nascimento) {
		super();
		this.nome = nome;
		this.nascimento = nascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getNascimento() {
		return nascimento;
	}

	public void setNascimento(Calendar nascimento) {
		this.nascimento = nascimento;
	}
	
	
}
