package br.com.htcursos.aula15;

public class Zelador extends Funcionario {

	public Zelador(String nome, double salario) {
		super(nome, salario);
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
