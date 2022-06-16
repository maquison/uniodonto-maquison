package br.com.maquison.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.maquison.entities.Empresa;
import br.com.maquison.entities.Funcionario;

public interface SetorService {
	static void listarSetor(Empresa empresa, String setor) {
		Collections.sort(empresa.getFuncionarios());
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		for(Funcionario funcionario : empresa.getFuncionarios()) {
			if (funcionario.getSetor().getDescricao().equalsIgnoreCase(setor)) {
				funcionarios.add(funcionario);
			}
		}
		System.out.println(empresa.getNome());
		System.out.println();
		String setorFormat = funcionarios.size() > 1 ? 
				"Setor - " + setor + " (" + funcionarios.size() + " funcinários)" : 
				"Setor - " + setor + " (" + funcionarios.size() + " funcinário)";
		System.out.println(setorFormat);
		System.out.println(funcionarios);
		System.out.println();
	}
}
