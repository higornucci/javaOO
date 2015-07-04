package br.com.htcursos.aula14;

public abstract class Funcionario {
	private double salario;
	
	private String nome;

	public Funcionario(double salario, String nome) {
		this.salario = salario;
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public String getNome() {
		return nome;
	}
	
	public abstract double getBonificacao();
}
