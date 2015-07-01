package br.com.htcursos.aula10;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeBonificacoes {
	
	List<Funcionario> funcionarios = new ArrayList<>();
	
	public void adicionar(Funcionario funcionario) {
		funcionarios.add(funcionario);
	}
	
	public double calcularTotalDeBonificacoes() {
		double total = 0;
		for (Funcionario funcionario : funcionarios) {
			total += funcionario.getBonificacao();
		}
		return total;
	}
}
