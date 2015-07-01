package br.com.htcursos.aula10;

public class Principal4 {
	public static void main(String[] args) {
		Estado saoPaulo = new Estado("São Paulo", "SP");
		Estado goias = new Estado("Goias", "GO");
		
		Cidade goiania = new Cidade("Goiania", goias);
		System.out.println(goiania.getEstado().getNome());
		
		System.out.println(saoPaulo.getNome() + " - " + saoPaulo.getUf());
	}
}
