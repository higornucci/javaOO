package br.com.htcursos.aula15;

public class CalculoDiaria implements CalculadorDeValor {

	@Override
	public double calcular(long inicio, long fim) {
		long tempoDeParada = ((fim - inicio)/60)/60;
		return tempoDeParada >= 24 ? 30 : 0;
	}
	
}
