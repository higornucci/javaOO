package br.com.htcursos.aula16;

public class Retangulo {
	private int altura;
	private int largura;
	
	public Retangulo(int altura, int largura) {
		this.altura = altura;
		this.largura = largura;
	}
	
	public int calcularArea() {
		return altura * largura;
	}
}