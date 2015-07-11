package br.com.htcursos.aula15;

public class GeradoDeRelatorio {
	public static void main(String[] args) {
		Relatorio relatorio;
		boolean botaoPdf = true;
		if(botaoPdf) {
			relatorio = new RelatorioPDF();
		} else {
			relatorio = new RelatorioWord();
		}
	}
}
