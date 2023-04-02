package controller;

import java.util.Scanner;

public class CaixaController {

	Scanner sc = new Scanner(System.in);

	public double adicionarVenda() {
		double total = 0;
		Caixa c = new Caixa();
		int opcVenda = 0;
		while (opcVenda != 2) {
			System.out.println("Adicionar itens ao carrinho? para sim digite 1, para não digite 2");
			opcVenda = sc.nextInt();
			switch (opcVenda) {
			case 1:
				System.out.println("Digite o valor do produto: ");
				total = c.venda(sc.nextDouble());
				break;
			}
		}
		return total;
	}

}
