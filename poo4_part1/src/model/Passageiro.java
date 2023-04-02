package model;

public class Passageiro extends Pessoa {

	String passaporte;
	String passagem;
	int lugar;

	public Passageiro(String nome, int idade, String documento, String passaporte, String passagem, int lugar) {
		super(nome, idade, documento);
		this.passaporte = passaporte;
		this.passagem = passagem;
		this.lugar = lugar;
	}

	
	
	@Override
	public String toString() {
		return "Passageiro [passaporte=" + passaporte + ", passagem=" + passagem + ", lugar=" + lugar + "]";
	}



	public void fazerCheckin() {
		System.out.println("checkin feito");
	}

	public void entrarAeronave() {
		System.out.println("entrou na aeronave");
	}

}
