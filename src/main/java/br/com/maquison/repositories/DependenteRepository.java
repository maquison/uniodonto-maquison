package br.com.maquison.repositories;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.maquison.entities.Dependente;
import br.com.maquison.utils.Util;

public interface DependenteRepository {
	static List<Dependente> generateDependentes(int opcao) {
		List<Dependente> dependentes = new ArrayList<Dependente>();
		
		switch(opcao) {
			case 1:
				dependentes = Arrays.asList(
					new Dependente("Felipe", Util.getNascimento("07/07/1992"))
				);
		    break;
			case 2:
				dependentes = Arrays.asList(
					new Dependente("Joana", Util.getNascimento("01/01/1990")), 
					new Dependente("Joao", Util.getNascimento("10/02/1995"))
				);
			    break;
			case 3:
				dependentes = Arrays.asList(
					new Dependente("Jose", Util.getNascimento("05/03/1980")), 
					new Dependente("Maria", Util.getNascimento("12/05/1991"))
				);
			    break;
			case 4:
				dependentes = Arrays.asList(
					new Dependente("Antonio", Util.getNascimento("07/04/1982"))
				);
			    break;
			case 5:
				dependentes = Arrays.asList(
					new Dependente("Marcos", Util.getNascimento("20/06/1985"))
				);
			    break;
			case 6:
				dependentes = Arrays.asList(
					new Dependente("Pedro", Util.getNascimento("15/08/1997"))
				);
			    break;
			case 7:
				dependentes = Arrays.asList(
					new Dependente("Francisca", Util.getNascimento("25/09/1975"))
				);
			    break;
			case 8:
				dependentes = Arrays.asList(
					new Dependente("Ana", Util.getNascimento("17/10/1990"))
				);
			    break;
			default:
				dependentes = new ArrayList<Dependente>();
		}
		return dependentes;
	}
}
