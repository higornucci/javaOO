package br.com.htcursos.aula13;

public class Caneta {
	private String corDaTinta;
	
	private int tamanho;
	
	private String corDoRevestimento;

	public Caneta(String corDaTinta, int tamanho, String corDoRevestimento) {
		this.corDaTinta = corDaTinta;
		this.tamanho = tamanho;
		this.corDoRevestimento = corDoRevestimento;
	}

	public String getCorDaTinta() {
		return corDaTinta;
	}

	public int getTamanho() {
		return tamanho;
	}

	public String getCorDoRevestimento() {
		return corDoRevestimento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((corDaTinta == null) ? 0 : corDaTinta.hashCode());
		result = prime
				* result
				+ ((corDoRevestimento == null) ? 0 : corDoRevestimento
						.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Caneta other = (Caneta) obj;
		if (corDaTinta == null) {
			if (other.corDaTinta != null)
				return false;
		} else if (!corDaTinta.equals(other.corDaTinta))
			return false;
		if (corDoRevestimento == null) {
			if (other.corDoRevestimento != null)
				return false;
		} else if (!corDoRevestimento.equals(other.corDoRevestimento))
			return false;
		return true;
	}
}
