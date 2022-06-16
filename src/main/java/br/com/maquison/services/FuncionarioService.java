package br.com.maquison.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import br.com.maquison.entities.Empresa;
import br.com.maquison.entities.Funcionario;

public interface FuncionarioService {
	static void listarFuncionarios(Empresa empresa) {
		Collections.sort(empresa.getFuncionarios());
		Map<String, List<Funcionario>> funcionarios = new HashMap<String, List<Funcionario>>();
		for(Funcionario funcionario : empresa.getFuncionarios()) {
			switch(funcionario.getSetor().getCodigo()) {
				case 1:
					if (!funcionarios.containsKey(funcionario.getSetor().getDescricao())) {
						funcionarios.put(funcionario.getSetor().getDescricao(), new ArrayList<Funcionario>());
				    }
					funcionarios.get(funcionario.getSetor().getDescricao()).add(funcionario);
					break;
				case 2:
					if (!funcionarios.containsKey(funcionario.getSetor().getDescricao())) {
						funcionarios.put(funcionario.getSetor().getDescricao(), new ArrayList<Funcionario>());
				    }
					funcionarios.get(funcionario.getSetor().getDescricao()).add(funcionario);
					break;
				case 3:
					if (!funcionarios.containsKey(funcionario.getSetor().getDescricao())) {
						funcionarios.put(funcionario.getSetor().getDescricao(), new ArrayList<Funcionario>());
				    }
					funcionarios.get(funcionario.getSetor().getDescricao()).add(funcionario);
					break;
				case 4:
					if (!funcionarios.containsKey(funcionario.getSetor().getDescricao())) {
						funcionarios.put(funcionario.getSetor().getDescricao(), new ArrayList<Funcionario>());
				    }
					funcionarios.get(funcionario.getSetor().getDescricao()).add(funcionario);
					break;
				case 5:
					if (!funcionarios.containsKey(funcionario.getSetor().getDescricao())) {
						funcionarios.put(funcionario.getSetor().getDescricao(), new ArrayList<Funcionario>());
				    }
					funcionarios.get(funcionario.getSetor().getDescricao()).add(funcionario);
					break;
			}
		}
		System.out.println(empresa.getNome() + " - Setores");
		System.out.println();
		for (String key : funcionarios.keySet()) {
			String setor = funcionarios.get(key).size() > 1 ? 
					key + " (" + funcionarios.get(key).size() + " funcinários)" : 
					key + " (" + funcionarios.get(key).size() + " funcinário)";
			System.out.println(setor);
			System.out.println("    " + StringUtils.join(funcionarios.get(key), "\n    "));
			System.out.println();
		}
	}
	
	static void listarFuncionario(Empresa empresa, String nome) {
		for(Funcionario funcionario : empresa.getFuncionarios()) {
			if (funcionario.getNome().equalsIgnoreCase(nome)) {
				System.out.println(funcionario);
			}
		}
	}
}
