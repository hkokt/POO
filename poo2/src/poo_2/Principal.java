package poo_2;

public class Principal {

	public static void main(String[] args) {
		instanciaRachaUnosDeFirma();
		instanciaCachorro();
		instanciaGeladeira();

	}

	private static void instanciaGeladeira() {
		Geladeira ge = new Geladeira();
		ge.altura = 2.10;
		ge.capacidadeTotal = 400;
		ge.consumoDeEnergia = 75;
		ge.largura = 1;
		ge.filtroDeAgua = true;

		Geladeira ge2 = new Geladeira();
		ge2.altura = 1.90;
		ge2.capacidadeTotal = 315;
		ge2.consumoDeEnergia = 50;
		ge2.largura = 1;
		ge2.filtroDeAgua = false;

		System.out.println("geladeira 1:");
		ge.ligar();
		ge.abrePorta();
		ge.fechaPorta();
		ge.desligar();
		
		
	}

	private static void instanciaCachorro() {
		Cachorro cao = new Cachorro();
		cao.raca = "pinscher";
		cao.peso = 4;
		cao.tamanho = 30;
		cao.vacinado = true;
		cao.castrado = true;

		Cachorro cao2 = new Cachorro();
		cao2.raca = "pitbull";
		cao2.peso = 30;
		cao2.tamanho = 50;
		cao2.vacinado = true;
		cao2.castrado = true;

		System.out.print(cao.raca + " ");
		cao.morder();
		System.out.print(cao2.raca + " ");
		cao2.latir();
		System.out.print(cao2.raca + " ");
		cao2.comer();

	}

	static void instanciaRachaUnosDeFirma() {

		UnoDeFirma unaoDaMassa = new UnoDeFirma();
		unaoDaMassa.escada = true;
		unaoDaMassa.setVelocidadeMaxima();
		unaoDaMassa.cor = "branco e rouxo";
		unaoDaMassa.firma = "oviv";

		UnoDeFirma unaoDeFraco = new UnoDeFirma();
		unaoDeFraco.escada = false;
		unaoDeFraco.setVelocidadeMaxima();
		unaoDeFraco.cor = "branco e azul";
		unaoDeFraco.firma = "mit";

		Controller.racha1v1(unaoDaMassa, unaoDeFraco);

	}

}
