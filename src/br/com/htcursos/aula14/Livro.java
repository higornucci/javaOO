package br.com.htcursos.aula14;

public class Livro {
	private int isbn;
	
	private String nome;
	
	private Autor autor;
	
	public Livro(String nome, Autor autor) {
		this.nome = nome;
		this.autor = autor;
	}
	
	public Livro(int isbn, String nome, Autor autor) {
		this.isbn = isbn;
		this.nome = nome;
		this.autor = autor;
	}
	
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	
	public Autor getAutor() {
		return autor;
	}

	public int getIsbn() {
		return isbn;
	}

	public String getNome() {
		return nome;
	}
}
