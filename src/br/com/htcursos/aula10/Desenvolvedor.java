package br.com.htcursos.aula10;

public class Desenvolvedor extends Funcionario{

	public Desenvolvedor(String nome, double salario, int idade) {
		super(nome, salario, idade);
	}
	
	@Override
	public double getBonificacao() {
		return super.getBonificacao() + 1000;
	}

}
