package br.com.htcursos.aula15;


public abstract class Funcionario implements Comparable<Funcionario> {
	private String nome;
	private double salario;
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	abstract void bonificar();
	
	public String getNome() {
		return nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double novoSalario) {
		if(novoSalario < this.salario) {
			System.out.println("nao pode diminuir o salario do cara");
		} else {
			this.salario = novoSalario;
		}
		
	}
	
	
}
