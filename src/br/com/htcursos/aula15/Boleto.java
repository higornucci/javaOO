package br.com.htcursos.aula15;

public class Boleto {
	
	private Status status;
	
	private double valor;
	
	public Boleto() {
		status = Status.EMITIDO;
	}

	private void setPago() {
		status = Status.PAGO;
	}
	
	public boolean estaPago() {
		return Status.PAGO.equals(status);
	}

	public void abaterValor(double valor) {
		this.valor -= valor;
		if(this.valor == 0) {
			setPago();
		}
	}

}
