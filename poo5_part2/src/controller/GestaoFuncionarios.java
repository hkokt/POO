package controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.Funcionario;

public class GestaoFuncionarios {

	int indice = 0;
	Funcionario[] funcionario = new Funcionario[50];

	public void criar(long id, String matricula, String nome, Date admissao, float salario, String horario) {
		for (indice = 0; indice < 50; indice++) {
			if (funcionario[indice] == null) {
				funcionario[indice] = new Funcionario(id, nome, matricula, admissao, salario, horario);
				break;
			}
		}
	}

	@SuppressWarnings("resource")
	public void atualizar(String matricula) throws ParseException {

		for (int i = 0; i < 50; i++) {

			if (this.funcionario[i].getMatricula().equals(matricula)) {
				System.out.println("id do funcionario " + funcionario[i].getId());

				Scanner sc = new Scanner(System.in);
				System.out.println("Digite novo nome do funcionario:");
				String nome = sc.next();

				System.out.println("Digite data de admissão:\n (ano/mes/dia)");
				String admissao = sc.next();

				System.out.println("Digite data de demissão:\n (ano/mes/dia)");
				String demissao = sc.next();

				System.out.println("Digite salario:");
				float salario = Float.parseFloat(sc.next());

				System.out.println("Digite horario");
				String horario = sc.next();

				this.funcionario[i].setNome(nome);
				this.funcionario[i].setAdmissao(new SimpleDateFormat("dd/MM/yyyy").parse(admissao));

				if (demissao.equals(null) || demissao.trim().equals("")) {
					this.funcionario[i].setDemissao(new SimpleDateFormat("dd/MM/yyyy").parse(demissao));
				}

				this.funcionario[i].setSalario(salario);
				this.funcionario[i].setHorario(horario);

				break;
			}
		}
	}

	public void excluir(String matricula) {
		for (int i = 0; i < 50; i++) {
			if (this.funcionario[i].getMatricula().equals(matricula)) {
				this.funcionario[i] = null;
				break;
			}
		}
	}

	public void exibir(String matricula) {
		for (Funcionario achoufuncionario : this.funcionario) {
			if (achoufuncionario.getMatricula().equals(matricula)) {
				System.out.println(achoufuncionario);
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
				System.out.println("\n\n\ndigite os dados do funcionario");

				System.out.println("Digite nome:");
				String nome = sc.next();

				System.out.println("Digite data de admissão:\n (ano/mes/dia)");
				String admissao = sc.next();

				System.out.println("Digite salario:");
				String salString = sc.next();
				float salario = Float.parseFloat(salString);

				System.out.println("Digite horario");
				String horario = sc.next();

				try {
					criar(generateId(), generateMatricula(), nome, new SimpleDateFormat("dd/MM/yyyy").parse(admissao),
							salario, horario);
				} catch (Exception e) {
					trataExceptionNull(e.toString());
				}

				break;

			case 'E':
				System.out.print("\n\n\nDigite a matricula do funcionario que deseja exibir: ");
				String raExibir = sc.next();

				try {
					exibir(raExibir);
				} catch (Exception e) {
					trataExceptionNull(e.toString());
				}

				break;

			case 'R':
				System.out.print("\n\n\nDigite o matricula do funcionario que deseja remover: ");
				String raRemover = sc.next();

				try {
					excluir(raRemover);
				} catch (Exception e) {
					trataExceptionNull(e.toString());
				}

				break;

			case 'A':
				System.out.print("\n\n\nDigite o matricula do funcionario que deseja atualizar: ");
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
			if (funcionario[i] == null) {
				id = Integer.toUnsignedLong(i + 1);
				break;
			}
		}
		return id;
	}

	private String generateMatricula() {
		String id = null;
		for (int i = 0; i < 50; i++) {
			if (funcionario[i] == null) {
				id = Integer.toString(i + 1);
				break;
			}
		}
		return id;
	}

	private void trataExceptionNull(String e) {
		if (e.contains("is null")) {
			System.err.println("o funcionario da matricula pesquisada referido não existe");
		}
	}
}
