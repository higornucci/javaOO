package br.com.htcursos.aula10;

public class Principal5 {
	
		  static int x = 37;

	public static void main(String[] args) {
		Funcionario jose = new Funcionario("José", 1000, 27);
		
		Estado ms = new Estado("Mato grosso do sul", "ms");
		System.out.println(x);
		Cidade dourados = new Cidade("Dourados", ms );
		jose.transferirPara(dourados);
		Integer.parseInt("10");
		System.out.println(jose.getNome());
		System.out.println(jose.getCidade().getNome());
	}
}
