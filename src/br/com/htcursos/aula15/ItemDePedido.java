package br.com.htcursos.aula15;

public class ItemDePedido {
	
	private String descricao;
	private double valor;
	
	public ItemDePedido(String descricao, double valor) {
		this.descricao = descricao;
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public double getValor() {
		return valor;
	}
}
