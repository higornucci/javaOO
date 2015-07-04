package br.com.htcursos.aula14;

public class Desenvolvedor extends Funcionario {

	public Desenvolvedor(double salario, String nome) {
		super(salario, nome);
	}

	public double getBonificacao() {
		return getSalario() + 700;
	}

}
