package br.com.htcursos.aula15;

public class CalculoDeEstacionamento {
	
	private long inicio;
	
	private long fim;

	private CalculadorDeValor calculador;
	
	public double valorConta() {
		return calculador.calcular(inicio, fim);
	}
	
	public void setTipoDeCalculo(CalculadorDeValor calculador) {
		this.calculador = calculador;
		
	}
}
