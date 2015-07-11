package br.com.htcursos.aula15;

public class PagamentoComDinheiro implements Pagamento {

	private Boleto boleto;

	public PagamentoComDinheiro(Boleto boleto) {
		this.boleto = boleto;
	}
	
	public void pagar(double valor) {
		boleto.abaterValor(valor);
	}
}
