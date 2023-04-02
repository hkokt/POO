package model;

public class Aeroporto {

	String nome;
	String endereco;
	String compania;

	public Aeroporto(String nome, String endereco, String compania) {
		this.nome = nome;
		this.endereco = endereco;
		this.compania = compania;
	}

	@Override
	public String toString() {
		return "Aeroporto [nome=" + nome + ", endereco=" + endereco + ", compania=" + compania + "]";
	}

	public void abre() {
		System.out.println("Aeroporto aberto");
	}

	public void fecha() {
		System.out.println("Aeroporto fechado");
	}

}
