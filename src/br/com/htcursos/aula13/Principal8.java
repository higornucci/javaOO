package br.com.htcursos.aula13;

import java.util.ArrayList;
import java.util.List;

public class Principal8 {
	public static void main(String[] args) {
		Marca fiat = new Marca("FIAT");
		List<Roda> rodas = new ArrayList<>();
		Roda rodaDianteiraEsquerda = new Roda(15);
		Roda rodaDianteiraDireita = new Roda(15);
		rodas.add(rodaDianteiraEsquerda);
		rodas.add(rodaDianteiraDireita);
		Carro uno = new Carro("Branco", fiat, rodas);
		
		System.out.println(uno.toString());
		
		Carro palio = new Carro("Preto", fiat, rodas);
		System.out.println(palio.toString());
		
		Carro palio2 = palio;
		
		if(palio == uno) {
			System.out.println("São iguais com ==.");
		} else  {
			System.out.println("São diferentes.");
		}
		
		if(palio == palio2) {
			System.out.println("São iguais com ==.");
		} else  {
			System.out.println("São diferentes.");
		}
		
		palio2.pintarDe("Amarelo");
		System.out.println(palio.getCor());
		System.out.println(palio2.getCor());
		
		if(palio.equals(uno)) {
			System.out.println("São iguais com equals.");
		} else  {
			System.out.println("São diferentes.");
		}
		
		uno.pintarDe("Amarelo");
		if(palio.equals(uno)) {
			System.out.println("São iguais com equals.");
		} else  {
			System.out.println("São diferentes.");
		}
		
		
	}
}
