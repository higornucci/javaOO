package br.com.htcursos.aula13;

import java.util.ArrayList;
import java.util.List;

public class Carro {
	private String cor;
	
	private Marca marca;
	
	private List<Roda> rodas = new ArrayList<>();

	public Carro(String cor, Marca marca, List<Roda> rodas) {
		this.cor = cor;
		this.marca = marca;
		this.rodas = rodas;
	}
	
	public int calcularNumeroDeRodas() {
		return rodas.size();
	}
	
	public String getCor() {
		return cor;
	}
	
	public Marca getMarca() {
		return marca;
	}
	
	public List<Roda> getRodas() {
		return rodas;
	}
	
	public void pintarDe(String cor) {
		this.cor = cor;
		Notificador.notificarDetran();
	}
	
	@Override
	public String toString() {
		return "Marca: " + marca.getNome() + "\n Cor: "+ cor;
	}
	
}
