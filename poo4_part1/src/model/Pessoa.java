package model;

public class Pessoa {

	String nome;
	int idade;
	String documento;

	public Pessoa(String nome, int idade, String documento) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.documento = documento;
	}

	public void respirar() {
		System.out.println("está viva");
	}

	public void comer() {
		System.out.println("está alimentada");
	}

}
