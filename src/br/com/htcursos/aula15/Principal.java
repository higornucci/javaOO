package br.com.htcursos.aula15;

public class Principal {
	public static void main(String[] args) {
		CalculoDeEstacionamento calculoDeEstacionamento = new CalculoDeEstacionamento();
		calculoDeEstacionamento.setTipoDeCalculo(new CalculoDiaria());
		
		System.out.println(calculoDeEstacionamento.valorConta());
	}
}
