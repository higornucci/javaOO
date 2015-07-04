package br.com.htcursos.aula14;

public class ContaPoupanca extends Conta {
	
	private static final double RENDIMENTO = 0.2;
	private static final double TAXA_DE_TRANSFERENCIA = 20;

	public ContaPoupanca(String numero, String agencia) {
		super(numero, agencia);
	}

	@Override
	public void sacar(double valor) {
		if(temSaldoPara(valor)) {
			super.valor -= valor;
		}
	}
	
	@Override
	boolean temSaldoPara(double valorTransferido) {
		return this.getSaldo() >= valorTransferido;
	}

	@Override
	void cobrarTaxaDeTransferecia() {
		super.valor -= TAXA_DE_TRANSFERENCIA;
	}
	
	@Override
	public double getSaldo() {
		return super.valor + (super.valor * RENDIMENTO);
	}

}
