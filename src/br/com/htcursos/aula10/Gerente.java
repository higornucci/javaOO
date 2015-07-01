package br.com.htcursos.aula10;

public class Gerente extends Funcionario {

	public Gerente(String nome, double salario, int idade) {
		super(nome, salario, idade);
	}
	
	@Override
	public double getBonificacao() {
		return super.getBonificacao() + 1500;
	}

}
