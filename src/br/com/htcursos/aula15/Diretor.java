package br.com.htcursos.aula15;

public class Diretor extends Funcionario implements Autenticavel {

	public Diretor(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public void login() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void bonificar() {
		super.setSalario(super.getSalario() + 500);
	}
	
	@Override
	public int compareTo(Funcionario funcionario) {
		return (int) (this.getSalario() - funcionario.getSalario()); // crescente
		// return (int) (funcionario.getSalario() -this.getSalario()); // decrescente
	}
	
}
