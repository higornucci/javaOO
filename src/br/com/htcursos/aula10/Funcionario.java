package br.com.htcursos.aula10;

public class Funcionario extends Pessoa {
	private String rg;
	private String cpf;
	private double salario;
	
	public Funcionario(String nome, double salario, int idade) {
		super(nome, idade);
		this.salario = salario;
	}
	
	public double getBonificacao() {
		return this.salario * 0.30;
	}
	
	public void transferirPara(Cidade cidade) {
		super.mudarPara(cidade);
	}
	
	public void setIdade(int idade) {
		super.idade = idade;
	}
	
	public String getCpf() {
		return cpf;
	}
	public String getRg() {
		return rg;
	}
	public double getSalario() {
		return salario;
	}
}
