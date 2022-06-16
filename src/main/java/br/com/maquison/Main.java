package br.com.maquison;

import br.com.maquison.entities.Empresa;
import br.com.maquison.repositories.FuncionarioRepository;
import br.com.maquison.services.FuncionarioService;

public class Main {

	public static void main(String[] args) {
		Empresa empresa = new Empresa("Uniodonto", FuncionarioRepository.generateFuncionarios());
		FuncionarioService.listarFuncionarios(empresa);
	}

}
