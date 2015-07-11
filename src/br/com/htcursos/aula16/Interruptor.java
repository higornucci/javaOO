package br.com.htcursos.aula16;

public class Interruptor {
	private Dispositivo dispositivo;
	
	public Interruptor(Dispositivo dispositivo) {
		this.dispositivo = dispositivo;
	}
	
	public void ativar() {
		dispositivo.ligar();
	}
	
	public void desativar() {
		dispositivo.desligar();
	}
}
