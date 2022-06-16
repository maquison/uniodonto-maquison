package br.com.maquison.repositories;

import java.util.Arrays;
import java.util.List;

import br.com.maquison.entities.Funcionario;
import br.com.maquison.utils.Util;

public interface FuncionarioRepository {
	
	static List<Funcionario> generateFuncionarios() {
		List<Funcionario> funcionarios = Arrays.asList(
				new Funcionario("Maquison", Util.getNascimento("07/07/1992"), "TI-07", 
						SetorRepository.generateSetor(1), DependenteRepository.generateDependentes(1)),
				new Funcionario("Antonia", Util.getNascimento("02/02/1985"), "ADM-01", 
						SetorRepository.generateSetor(2), DependenteRepository.generateDependentes(2)),
				new Funcionario("Castro", Util.getNascimento("01/01/1997"), "TI-01", 
						SetorRepository.generateSetor(1), DependenteRepository.generateDependentes(3)),
				new Funcionario("Bruna", Util.getNascimento("10/10/1995"), "RH-01", 
						SetorRepository.generateSetor(4), DependenteRepository.generateDependentes(4)),
				new Funcionario("Daniel", Util.getNascimento("09/11/1994"), "FN-01", 
						SetorRepository.generateSetor(3), DependenteRepository.generateDependentes(5)),
				new Funcionario("Luanna", Util.getNascimento("26/05/2003"), "TI-26", 
						SetorRepository.generateSetor(1), DependenteRepository.generateDependentes(0)),
				new Funcionario("Raimundo", Util.getNascimento("20/12/1978"), "OP-01", 
						SetorRepository.generateSetor(5), DependenteRepository.generateDependentes(6)),
				new Funcionario("Paulo", Util.getNascimento("01/11/1990"), "TI-02", 
						SetorRepository.generateSetor(1), DependenteRepository.generateDependentes(0)),
				new Funcionario("Mariana", Util.getNascimento("27/09/1988"), "ADM-02", 
						SetorRepository.generateSetor(2), DependenteRepository.generateDependentes(8)),
				new Funcionario("Ronaldo", Util.getNascimento("08/03/1991"), "OP-02", 
						SetorRepository.generateSetor(5), DependenteRepository.generateDependentes(7))
		);
		return funcionarios;
	}
	
}
