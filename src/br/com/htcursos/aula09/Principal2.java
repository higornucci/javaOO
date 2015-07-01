package br.com.htcursos.aula09;

public class Principal2 {
	public static void main(String[] args) {
		ContaCorrente contaDaMaria = new ContaCorrente();
		
		contaDaMaria.depositar(200);
		
		contaDaMaria.sacar(1100);
		
		contaDaMaria.depositar(200);
		
		System.out.println(contaDaMaria.saldo());
	}
}
