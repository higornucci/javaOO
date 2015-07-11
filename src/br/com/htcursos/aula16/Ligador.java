package br.com.htcursos.aula16;

public class Ligador {
	public static void main(String[] args) {
		Dispositivo arCondiconado = new ArCondiconado();
		Interruptor interruptorDoQuarto = new Interruptor(arCondiconado);
		
		Dispositivo lampada = new Lampada();
		Interruptor interruptorDaSala = new Interruptor(lampada );
		
		Dispositivo datashow = new Datashow();
		Interruptor interruptorDaSala2 = new Interruptor(datashow);
		interruptorDaSala2.ativar();
		
		interruptorDoQuarto.ativar();
		interruptorDaSala.ativar();
	}
}
