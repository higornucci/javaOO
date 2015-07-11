package br.com.htcursos.aula15;

public class DescontoAcimaDe100 implements Desconto{

	@Override
	public double aplicar(double valor) {
		return valor >= 100 ? valor * 0.5 : 0;
	}

}
