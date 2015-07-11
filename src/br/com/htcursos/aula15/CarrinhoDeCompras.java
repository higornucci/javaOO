package br.com.htcursos.aula15;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	
	private double valorTotal = 0;
	
	private List<ItemDePedido> itemDePedidos = new ArrayList<>();
	
	public void adicionar(ItemDePedido itemDePedido)  {
		itemDePedidos.add(itemDePedido);
	}
	
	public double calcularValor() {
		for (ItemDePedido itemDePedido : itemDePedidos) {
			valorTotal += itemDePedido.getValor();
		}
		valorTotal -= new DescontoAcimaDe100().aplicar(valorTotal);
		valorTotal -= new DescontoAcimaDe200().aplicar(valorTotal);
		return valorTotal;
	}
}
