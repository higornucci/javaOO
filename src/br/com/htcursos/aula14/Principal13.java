package br.com.htcursos.aula14;

public class Principal13 {
	public static void main(String[] args) {
		Funcionario funcionario = new Diretor(1000, "Jorge");
		
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getSalario());
	}
}
