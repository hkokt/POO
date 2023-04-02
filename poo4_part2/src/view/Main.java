package view;

import java.util.Scanner;

import model.Dinossauro;

public class Main {
	public static void main(String[] args) {

		Dinossauro skeep = new Dinossauro();

		try (Scanner sc = new Scanner(System.in)) {
			String opcString = "";
			/*
			 * [(P)ular] [(C)orrer] [Co(M)er] [C(A)ntar]
			 * 
			 * [Tomar (S)ol] [Ficar na S(O)mbra]
			 */
			while (opcString != "sair") {
				System.out.println("Ações para Skeep" + "\r\n(P)ular           (C)orrer               Co(M)er\r\n"
						+ "C(A)ntar          Tomar (S)ol            Ficar na S(O)mbra\nMostrar status (U)");
				opcString = sc.nextLine().toUpperCase();
				char opcChar = opcString.charAt(0);
				switch (opcChar) {
				case 'P':
					skeep.pular();
					System.out.println(skeep.toString());
					break;
				case 'C':
					skeep.correr();
					System.out.println(skeep.toString());
					break;
				case 'M':
					skeep.comer();
					System.out.println(skeep.toString());
					break;
				case 'A':
					skeep.cantar();
					System.out.println(skeep.toString());
					break;
				case 'S':
					skeep.tomarSol();
					System.out.println(skeep.toString());
					break;
				case 'O':
					skeep.ficarNaSombra();
					System.out.println(skeep.toString());
					break;
				case 'U':
					System.out.println(skeep.toString());
					break;
				}
			}
		}
	}
}
