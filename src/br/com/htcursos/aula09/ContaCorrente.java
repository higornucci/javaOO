package br.com.htcursos.aula09;

public class ContaCorrente {
	String agencia;
	String numero;
	double valor;
	double limite = 1000;
	
	public void depositar(double valorDepositado) {
		valor += valorDepositado; // valor = valor + valorDepositado;
	}
	
	public void sacar(double valorSacado) {
		if(valorSacado < saldo()) {
			valor -= valorSacado; // valor = valor - valorSacado;
		} else {
			System.out.println("Saldo insuficiente");
		}
	}
	
	public double saldo() {
		return limite + valor;
	}
}
