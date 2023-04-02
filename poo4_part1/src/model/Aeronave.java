package model;

public class Aeronave {

	int capacidade;
	String compania;
	String nome;

	public Aeronave(int capacidade, String compania, String nome) {
		this.capacidade = capacidade;
		this.compania = compania;
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Aeronave [capacidade=" + capacidade + ", compania=" + compania + ", nome=" + nome + "]";
	}

	public void voar() {
		System.out.println("fiaaaaaum");
	}

}
