package br.com.htcursos.aula14;

public class Autor {
	private String nome;
	
	private int idade;

	public Autor(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}
}
