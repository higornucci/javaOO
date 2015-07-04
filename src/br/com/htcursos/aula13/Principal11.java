package br.com.htcursos.aula13;

public class Principal11 {
	public static void main(String[] args) {
		int resultado = Soma.calcular(1, 2);
		
		System.out.println(resultado);
		
		Login.logar();
		Login.logar();
		
		System.out.println(Login.getCONTADOR_DE_ACESSO());
		
		Login login2 = new Login();
		login2.logar();
		
		System.out.println(login2.getCONTADOR_DE_ACESSO());
		
		Login login3 = new Login();
		System.out.println(login3.getCONTADOR_DE_ACESSO());
	}
}
