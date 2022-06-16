package br.com.maquison.entities;

import java.util.Calendar;

import br.com.maquison.utils.Util;

public class Dependente extends Pessoa {

	public Dependente(String nome, Calendar nascimento) {
		super(nome, nascimento);
	}

	@Override
	public String toString() {
		return "Dependente [nome: " + getNome() + ", nascimento: " + Util.formatDate(getNascimento().getTime()) + "]";
	}
	
	
}
