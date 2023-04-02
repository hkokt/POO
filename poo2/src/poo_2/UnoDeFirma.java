package poo_2;

public class UnoDeFirma {

	public boolean escada;
	public String firma;
	public String cor;
	public double velocidadeMaxima;
	public double aceleracao = 0;

	public void setVelocidadeMaxima() {
		if (escada) {
			velocidadeMaxima = 1400.00;
		} else {
			velocidadeMaxima = 140.00;
		}
	}

	public void acelera() {
		if (aceleracao < velocidadeMaxima) {
			if (escada) {
				aceleracao += 200;
			} else {
				aceleracao += 10;
			}
		}
	}

	public void desacelera() {
		if (aceleracao >= 0) {
			if (escada) {
				aceleracao = aceleracao / 60;
			} else {
				aceleracao -= aceleracao;
			}
		}
	}

	public void mostraRonco() {
		System.out.println("VRUMMM");
	}

}
