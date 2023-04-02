package view;

import java.text.ParseException;
import controller.GestaoAlunos;

public class Main {
	public static void main(String[] args) {
		try {
			new GestaoAlunos().menu();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
