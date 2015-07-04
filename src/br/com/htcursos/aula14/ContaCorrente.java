package br.com.htcursos.aula14;

public class ContaCorrente extends Conta{
	
	private static final double TAXA_DE_TRANSFERENCIA = 14.8;
	private double limite = 1000;

	public ContaCorrente(String numero, String agencia) {
		super(numero, agencia);
	}

	@Override
	public void sacar(double valor) {
		if(temSaldoPara(valor)) {
			super.valor -= valor;
		}
	}

	@Override
	void cobrarTaxaDeTransferecia() {
		super.valor -= TAXA_DE_TRANSFERENCIA;
	}

	@Override
	boolean temSaldoPara(double valorTransferido) {
		return this.getSaldo() >= valorTransferido;
	}

	@Override
	public double getSaldo() {
		return this.limite + super.valor;
	}

}
