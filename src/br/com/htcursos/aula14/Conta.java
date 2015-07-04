package br.com.htcursos.aula14;

public abstract class Conta {
	private String numero;
	private String agencia;
	protected double valor;

	public Conta(String numero, String agencia) {
		this.numero = numero;
		this.agencia = agencia;
	}
	
	public final void depositar(double valorDepositado) {
		this.valor += valorDepositado;
	}
	
	public void transferirPara(Conta conta, double valorTransferido) {
		if(temSaldoPara(valorTransferido)) {
			this.sacar(valorTransferido);
			conta.transferirPara(conta, valorTransferido);
			cobrarTaxaDeTransferecia();
		} 
	}
	
	public abstract void sacar(double valor);
	public abstract double getSaldo();
	abstract boolean temSaldoPara(double valor);
	abstract void cobrarTaxaDeTransferecia();

	public String getNumero() {
		return numero;
	}

	public String getAgencia() {
		return agencia;
	}

}
