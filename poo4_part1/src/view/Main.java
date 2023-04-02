package view;

import model.Aeronave;
import model.Aeroporto;
import model.Passageiro;
import model.Piloto;

public class Main {
	public static void main(String[] args) {

		Aeronave aviao = new Aeronave(100, "mat", "206");
		aviao.voar();

		Aeroporto aeroporto = new Aeroporto("aeroporto", "rua x, bairro y", "log");
		aeroporto.abre();

		Piloto piloto = new Piloto("Mario", 110, "2345678", "8765432", "azul escuro", 12);
		piloto.pilotarAeronave();

		Passageiro passageiro = new Passageiro("Luigi", 100, "0000000", "0000000", "Bolivia", 69);
		passageiro.entrarAeronave();

		System.out.print("\n\n\n\n\n");
		System.out.println("=========objetos=========");
		System.out.println(aviao.toString());
		System.out.println(aeroporto.toString());
		System.out.println(piloto.toString());
		System.out.println(passageiro.toString());
	}

}
