package poo_2;

public class Controller {

	static void racha1v1(UnoDeFirma unao1, UnoDeFirma unao2) {

		double distancia = 200000;
		double percorridoUnao1 = 0;
		double percorridoUnao2 = 0;

		int tempo = 0;
		int tempo2 = 0;

		while (percorridoUnao1 <= distancia) {
			unao1.acelera();
			percorridoUnao1 += unao1.aceleracao;
			tempo++;
		}

		while (percorridoUnao2 <= distancia) {
			unao2.acelera();
			percorridoUnao2 += unao2.aceleracao;
			tempo2++;
		}

		if (tempo < tempo2) {
			System.out.println("unão 1 ganhou");
		} else if (tempo == tempo2) {
			System.out.println("empate");
		} else {
			System.out.println("unão 2 ganhou");
		}
	}
}
