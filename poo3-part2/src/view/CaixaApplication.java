package view;

import java.util.Scanner;

import controller.Caixa;

public class CaixaApplication {

	public static void main(String[] args) {
		Caixa c = new Caixa();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite todos os valores separados por virgula: ");
			String strVals = sc.next();

			int i = 0;
			String[] vetorStr = strVals.split(",");
			double[] vetorDouble = new double[vetorStr.length];

			for (String str : vetorStr) {
				vetorDouble[i] = Double.parseDouble(str);
			}

			System.out.println("O saldo total da compra é de: " + c.venda(vetorDouble));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

	}

}
