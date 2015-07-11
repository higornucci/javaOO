package br.com.htcursos.aula15;

import java.util.List;

public class GerenciadorDePagamentos {
	public static void main(String[] args) {
		Boleto boleto = new Boleto();
		CartaoDeDebito cartaoDeDebito = new CartaoDeDebito();
		Pagamento pagamentoComCartaoDeDebito = new PagamentoComCartaoDeDebito(boleto , cartaoDeDebito);
		pagamentoComCartaoDeDebito.pagar(100);
		Pagamento pagamentoComDinheiro = new PagamentoComDinheiro(boleto);
		pagamentoComDinheiro.pagar(100);
	}
}
