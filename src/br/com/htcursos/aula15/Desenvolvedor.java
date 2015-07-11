package br.com.htcursos.aula15;

public class Desenvolvedor extends Funcionario implements Autenticavel {

	public Desenvolvedor(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public void login() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void bonificar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int compareTo(Funcionario funcionario) {
		return (int) (this.getSalario() - funcionario.getSalario()); // crescente
		// return (int) (funcionario.getSalario() -this.getSalario()); // decrescente
	}

}
