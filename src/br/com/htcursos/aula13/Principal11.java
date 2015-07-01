package br.com.htcursos.aula13;

public class Principal11 {
	public static void main(String[] args) {
		int resultado = Soma.calcular(1, 2);
		
		System.out.println(resultado);
		
		Login login = new Login();
		login.logar();
		login.logar();
		
		System.out.println(Login.getCONTADOR_DE_ACESSO());
		
		Login login2 = new Login();
		login2.logar();
		
		System.out.println(Login.getCONTADOR_DE_ACESSO());
	}
}
