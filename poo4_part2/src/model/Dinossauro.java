package model;

public class Dinossauro {

	private double energia = 10;
	private double velocidade = 10;
	private double temperatura = 35;
	private String humor = "Neutro";

	@Override
	public String toString() {
		return "Status Skeep-> \nenergia: " + energia + "\nvelocidade: " + velocidade + "\ntemperatura: " + temperatura
				+ "\nhumor: " + humor;
	}

	public void pular() {
		this.energia -= 1.5;
		this.velocidade -= 1;
		this.humor = "Feliz";
	}

	public void correr() {
		this.energia -= 1;
		this.velocidade -= 0.5;
		this.humor = "Feliz";
	}

	public void comer() {
		this.energia += 1;
		this.velocidade -= 1;
		this.humor = "Feliz";
	}

	public void cantar() {
		this.energia -= 0.25;
		this.humor = "Feliz";
	}

	public void tomarSol() {
		this.velocidade += 1;
		this.temperatura += 0.5;
		this.humor = "Feliz";
	}

	public void ficarNaSombra() {
		this.energia += 1;
		this.temperatura -= 1;
		this.humor = "Triste";
	}

}
