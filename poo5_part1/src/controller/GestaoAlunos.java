package controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.Aluno;

public class GestaoAlunos {

	int indice = 0;
	Aluno[] aluno = new Aluno[50];

	public void criar(long id, Date nascimento, String ra, String nome) {
		for (indice = 0; indice < 50; indice++) {
			if (aluno[indice] == null) {
				aluno[indice] = new Aluno(id, nascimento, ra, nome);
				break;
			}
		}
	}

	@SuppressWarnings({ "deprecation", "resource" })
	public void atualizar(String ra) {

		for (int i = 0; i < 50; i++) {

			if (this.aluno[i].getRa().equals(ra)) {
				System.out.println("id do aluno " + aluno[i].getId());

				Scanner sc = new Scanner(System.in);
				System.out.println("Digite novo nome do aluno:");
				String novoNome = sc.next();

				System.out.println("Digite novo nascimento:\n (ano/mes/dia)");
				String novoNascimento = sc.next();

				this.aluno[i].setNome(novoNome);
				this.aluno[i].setNascimento(new Date(novoNascimento));
				break;
			}
		}
	}

	public void excluir(String ra) {
		for (int i = 0; i < 50; i++) {
			if (this.aluno[i].getRa().equals(ra)) {
				this.aluno[i] = null;
				break;
			}
		}
	}

	public void exibir(String ra) {
		for (Aluno achouAluno : this.aluno) {
			if (achouAluno.getRa().equals(ra)) {
				System.out.println(achouAluno);
				break;
			}
		}
	}

	@SuppressWarnings("resource")
	public void menu() throws ParseException {

		char opt = 0;
		Scanner sc = new Scanner(System.in);

		while (opt != 'S') {

			System.out.println("(C)riar (E)xibir (R)emover\n(A)tualizar (Sair)");
			System.out.print("Ação: ");
			String option = sc.next();
			opt = option.toUpperCase().charAt(0);

			switch (opt) {

			case 'C':
				System.out.println("\n\n\ndigite os dados do aluno");
				System.out.print("nome: ");
				String nome = sc.next();
				System.out.print("data de nascimento: \n(ano/mes/dia)\n");
				String nascimento = sc.next();
				Date nasc = new SimpleDateFormat("dd/MM/yyyy").parse(nascimento);

				try {
					criar(generateId(), nasc, generateRa(), nome);
				} catch (Exception e) {
					trataExceptionNull(e.toString());
				}

				break;

			case 'E':
				System.out.print("\n\n\nDigite o Ra do aluno que deseja exibir: ");
				String raExibir = sc.next();

				try {
					exibir(raExibir);
				} catch (Exception e) {
					trataExceptionNull(e.toString());
				}

				break;

			case 'R':
				System.out.print("\n\n\nDigite o Ra do aluno que deseja remover: ");
				String raRemover = sc.next();

				try {
					excluir(raRemover);
				} catch (Exception e) {
					trataExceptionNull(e.toString());
				}

				break;

			case 'A':
				System.out.print("\n\n\nDigite o Ra do aluno que deseja atualizar: ");
				String raAtualizar = sc.next();

				try {
					atualizar(raAtualizar);
				} catch (Exception e) {
					trataExceptionNull(e.toString());
				}

				break;

			case 'S':
				System.exit(0);
				break;

			default:
				System.out.println("opção inválida");
				break;
			}
		}
	}

	private long generateId() {
		Long id = 0l;
		for (int i = 0; i < 50; i++) {
			if (aluno[i] == null) {
				id = Integer.toUnsignedLong(i + 1);
				break;
			}
		}
		return id;
	}

	private String generateRa() {
		String id = null;
		for (int i = 0; i < 50; i++) {
			if (aluno[i] == null) {
				id = Integer.toString(i + 1);
				break;
			}
		}
		return id;
	}

	private void trataExceptionNull(String e) {
		if (e.contains("is null")) {
			System.err.println("o aluno do ra referido não existe");
		}
	}
}
