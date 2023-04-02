package controller;

public class Caixa {

	private double saldo;

	public double venda(double valoresProduto) {
		this.saldo = this.saldo + valoresProduto;
		return this.saldo;
	}

}
