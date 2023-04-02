package controller;

public class Caixa {

	private double saldo;

	public double venda(double... valoresProduto) {
		for (double valor : valoresProduto) {
			this.saldo = this.saldo + valor;
		}
		return this.saldo;
	}
}
