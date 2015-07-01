package br.com.htcursos.aula13;

import java.util.ArrayList;
import java.util.List;

public class Principal7 {
	public static void main(String[] args) {
		Marca fiat = new Marca("FIAT");
		List<Roda> rodas = new ArrayList<>();
		Roda rodaDianteiraEsquerda = new Roda(15);
		Roda rodaDianteiraDireita = new Roda(15);
		rodas.add(rodaDianteiraEsquerda);
		rodas.add(rodaDianteiraDireita);
//		for (Roda roda : rodas) {
//			rodas.add(rodaDianteiraDireita);
//		}
//		rodas.remove(rodaDianteiraEsquerda);
		System.out.println("Indice da roda: " + rodas.indexOf(rodaDianteiraEsquerda));
		System.out.println("Tamanho da roda " + rodas.get(0).getTamanho());
		System.out.println("Tamanho da lista " + rodas.size());
		Carro carro = new Carro("Branco", fiat, rodas);
		carro.calcularNumeroDeRodas();
		System.out.println(carro.getCor());
	}
}
