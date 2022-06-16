package br.com.maquison.entities;

import java.util.List;

public class Empresa {
	private String nome;
	private List<Funcionario> funcionarios;
	
	public Empresa() {}
	
	public Empresa(String nome, List<Funcionario> funcionarios) {
		super();
		this.nome = nome;
		this.funcionarios = funcionarios;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	@Override
	public String toString() {
		return "Empresa [nome: " + nome + ", funcionarios: " + funcionarios + "]";
	}
	
}
