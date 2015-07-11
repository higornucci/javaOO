package br.com.htcursos.aula16;

public interface RepositorioGenerico<T> {
	
	public T buscar(int id);
	public void adicionar(T objeto);
	public void remover(T objeto);
}
