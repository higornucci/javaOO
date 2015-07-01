package br.com.htcursos.aula10;

public class Estado {
	private String nome;
	private String uf;
	
	public Estado(String nome, String uf) {
		validar(uf);
		this.nome = nome;
		this.uf = uf;
	}

	private void validar(String uf) {
		// TODO Auto-generated method stub
	}

	public String getNome() {
		return nome;
	}

	public String getUf() {
		return uf;
	}
}
