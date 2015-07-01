package br.com.htcursos.aula10;

public class Principal6 {
	public static void main(String[] args) {
		Funcionario gerente = new Gerente("João", 1000, 30);
		Funcionario desenvolvedor = new Desenvolvedor("Airton", 2000, 25);
		Funcionario analista = new Analista("Maria", 500, 22);
		
		GerenciadorDeBonificacoes gerenciadorDeBonificacoes = new GerenciadorDeBonificacoes();
		gerenciadorDeBonificacoes.adicionar(analista);
		gerenciadorDeBonificacoes.adicionar(desenvolvedor);
		gerenciadorDeBonificacoes.adicionar(gerente);
		
		double total = gerenciadorDeBonificacoes.calcularTotalDeBonificacoes();
		
		System.out.println(total);
		
	}
}
