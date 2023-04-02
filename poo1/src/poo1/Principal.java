package poo1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite um numero:");
			double num1 = sc.nextDouble();
			System.out.println("Digite outro numero:");
			double num2 = sc.nextDouble();
			System.out.println(num1 + num2);
		}

	}

}
