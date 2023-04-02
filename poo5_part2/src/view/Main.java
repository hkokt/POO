package view;

import java.text.ParseException;
import controller.GestaoFuncionarios;

public class Main {
	public static void main(String[] args) {
		try {
			new GestaoFuncionarios().menu();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
