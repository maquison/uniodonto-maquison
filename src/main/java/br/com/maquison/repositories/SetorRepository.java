package br.com.maquison.repositories;

import br.com.maquison.entities.Setor;

public interface SetorRepository {
	static Setor generateSetor(int opcao) {
		Setor setor = new Setor();
		switch(opcao) {
			case 1:
				setor = new Setor(opcao, "Tecnologia da Informação");
				break;
			case 2:
				setor = new Setor(opcao, "Administrativo");
				break;
			case 3:
				setor = new Setor(opcao, "Financeiro");
				break;
			case 4: 
				setor = new Setor(opcao, "RH");
				break;
			case 5:
				setor = new Setor(opcao, "Operacional");
				break;
		}
		return setor;
	}
}
