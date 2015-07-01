package br.com.htcursos.aula09;

public class Cliente {
	public String nome;
	private String cpf;
	private String rg;
	private ContaCorrente conta;
	
	public ContaCorrente getConta() {
		return conta;
	}
	public void setConta(ContaCorrente conta) {
		this.conta = conta;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
}
