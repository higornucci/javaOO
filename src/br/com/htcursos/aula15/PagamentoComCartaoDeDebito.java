package br.com.htcursos.aula15;

public class PagamentoComCartaoDeDebito implements Pagamento {
	private Boleto boleto;
	private CartaoDeDebito cartaoDeDebito;

	public PagamentoComCartaoDeDebito(Boleto boleto, CartaoDeDebito cartaoDeDebito) {
		this.boleto = boleto;
		this.cartaoDeDebito = cartaoDeDebito;
	}
	
	public void pagar(double valor) {
		if(cartaoDeDebito.autorizar(valor)) {
			boleto.abaterValor(valor);
		}
	}
}
