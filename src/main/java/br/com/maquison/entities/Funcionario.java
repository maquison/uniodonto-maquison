package br.com.maquison.entities;

import java.util.Calendar;
import java.util.List;

import br.com.maquison.utils.Util;

public class Funcionario extends Pessoa implements Comparable<Funcionario>{
	private String matricula;
	private Setor setor;
	private List<Dependente> dependentes;

	public Funcionario(String nome, Calendar nascimento, String matricula, Setor setor, List<Dependente> dependentes) {
		super(nome, nascimento);
		this.matricula = matricula;
		this.setor = setor;
		this.dependentes = dependentes;
	}

	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Setor getSetor() {
		return setor;
	}
	public void setSetor(Setor setor) {
		this.setor = setor;
	}
	public List<Dependente> getDependentes() {
		return dependentes;
	}
	public void setDependentes(List<Dependente> dependentes) {
		this.dependentes = dependentes;
	}

	@Override
	public int compareTo(Funcionario f) {
		return this.getNome().compareTo(f.getNome());
	}

	@Override
	public String toString() {
		return "Funcionario [nome: " + getNome() + ", nascimento: " + Util.formatDate(getNascimento().getTime()) + ", matricula: " + matricula + 
				", setor: " + setor + ", dependentes: " + dependentes + "]";
	}
	
	
}
