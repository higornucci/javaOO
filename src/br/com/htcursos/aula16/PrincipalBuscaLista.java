package br.com.htcursos.aula16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.htcursos.aula15.Desenvolvedor;
import br.com.htcursos.aula15.Diretor;
import br.com.htcursos.aula15.Funcionario;
import br.com.htcursos.aula15.Zelador;

public class PrincipalBuscaLista {
	public static void main(String[] args) {
		List<Funcionario> funcionarios = new ArrayList<>();
		Funcionario joao = new Diretor("João", 2500);
		funcionarios.add(joao);
		Funcionario virmerson = new Zelador("Virmerson", 1500);
		funcionarios.add(virmerson);
		Funcionario maria = new Desenvolvedor("Maria", 3000);
		funcionarios.add(maria);
		Funcionario jose = new Desenvolvedor("José", 3000);
		funcionarios.add(jose);
		
		Comparable<Funcionario> comparadorPorNome = new Comparable<Funcionario>() {
			
			@Override
			public int compareTo(Funcionario funcionario) {
				return this.compareTo(funcionario);
			}
		};
		
		for(int i = 0;i<funcionarios.size();i++) {
			if(funcionarios.get(i).getNome().equals("Maria")) {
				System.out.println("Contem no for loko");
			}
		}
		
		// ordenação tem q implementar comparable
		Collections.sort(funcionarios);
		
		System.out.println(funcionarios.get(0).getNome());
		System.out.println(funcionarios.get(1).getNome());
		System.out.println(funcionarios.get(2).getNome());
		System.out.println(funcionarios.get(3).getNome());
		
		funcionarios.contains(maria);
		int posicaoDaMaria = funcionarios.indexOf(maria);
		funcionarios.remove(posicaoDaMaria);
		funcionarios.remove(maria);
		
		for(Funcionario f : funcionarios) {
			if(f.getNome().equals("Maria")) {
				System.out.println("Contem no for legal");
			}
		}
	}
}
