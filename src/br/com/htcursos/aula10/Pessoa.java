package br.com.htcursos.aula10;

public class Pessoa {
	
	private String nome;
	protected int idade;
	private Cidade cidade;
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public void mudarPara(Cidade cidade) {
		this.cidade = cidade;
	}

	public String getNome() {
		return nome;
	}

	public Cidade getCidade() {
		return cidade;
	}
	

}
