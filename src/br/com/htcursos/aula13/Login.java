package br.com.htcursos.aula13;

public class Login {
	
	private static int CONTADOR_DE_ACESSO;
	
	public static void logar() {
		CONTADOR_DE_ACESSO += 1;
//		logica para logar
	}

	public static int getCONTADOR_DE_ACESSO() {
		return CONTADOR_DE_ACESSO;
	}
}
