package br.com.htcursos.aula13;

public class Principal9 {
	public static void main(String[] args) {
		Caneta canetaPreta1 = new Caneta("preta", 12, "tranparente");
		Caneta canetaPreta2 = new Caneta("preta", 12, "tranparente");
		
		if(canetaPreta1 == canetaPreta2) {
			System.out.println("S�o iguais com ==.");
		} else  {
			System.out.println("S�o diferentes.");
		}
		
		if(canetaPreta1.equals(canetaPreta2)) {
			System.out.println("S�o iguais com equals.");
		} else  {
			System.out.println("S�o diferentes.");
		}
		
		System.out.println(canetaPreta1.hashCode());
		System.out.println(canetaPreta2.hashCode());
	}
}
