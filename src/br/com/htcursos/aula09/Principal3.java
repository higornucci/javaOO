package br.com.htcursos.aula09;

public class Principal3 {
	public static void main(String[] args) {
		Cliente maria = new Cliente();
		maria.setNome("Maria");
		
		ContaCorrente contaDaMaria = new ContaCorrente();
		
		maria.setConta(contaDaMaria);
		
		System.out.println(maria.getConta().saldo());
		
		maria.getConta().depositar(200);
		
		Cliente jose = new Cliente();
		jose.setNome("José");
		
		ContaCorrente contaDoJose = new ContaCorrente();
		jose.setConta(contaDoJose);
		System.out.println("Saldo José" + jose.getConta().saldo());
		
		
	}
}
