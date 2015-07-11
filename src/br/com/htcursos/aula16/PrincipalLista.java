package br.com.htcursos.aula16;

import java.util.ArrayList;
import java.util.List;

import br.com.htcursos.aula15.Diretor;
import br.com.htcursos.aula15.Funcionario;

public class PrincipalLista {
	public static void main(String[] args) {
		List<Funcionario> funcionarios = new ArrayList<>();
		System.out.println(funcionarios.size());
		Diretor diretor = new Diretor("João da Silva", 2500);
		funcionarios.add(diretor);
		System.out.println(funcionarios.size());
		if(funcionarios.contains(diretor)) {
			System.out.println("Contem");
		}
		System.out.println(funcionarios.indexOf(diretor));
		funcionarios.add(0, diretor);
		System.out.println(funcionarios.size());
		System.out.println(funcionarios.get(0).getNome());
		System.out.println(funcionarios.get(1).getNome());
		funcionarios.remove(diretor);
		System.out.println(funcionarios.size());
		funcionarios.clear();
		System.out.println(funcionarios.size());
	}
}
