package br.com.htcursos.aula14;

public class Diretor extends Funcionario {

	public Diretor(double salario, String nome) {
		super(salario, nome);
	}

	@Override
	public double getBonificacao() {
		return getSalario() + 600;
	}

}
