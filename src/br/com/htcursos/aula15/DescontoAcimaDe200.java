package br.com.htcursos.aula15;

public class DescontoAcimaDe200 implements Desconto {

	@Override
	public double aplicar(double valor) {
		return valor >= 200 ? valor * .1 : 0;
	}

}
