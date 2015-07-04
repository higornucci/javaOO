package br.com.htcursos.aula14;

public class Principal12 {
	public static void main(String[] args) {
		Autor autora = new Autor("Autora", 50);
		Livro quebreACabeca = new Livro("Quebre A Cabeça", autora);
		
		System.out.println(quebreACabeca.getIsbn());
		System.out.println(quebreACabeca.getNome());
		System.out.println(quebreACabeca.getAutor().getNome());
		
		String nome = new String("Testando");
		
		Integer inteiro = new Integer("10");
		System.out.println(inteiro);
	}
}
