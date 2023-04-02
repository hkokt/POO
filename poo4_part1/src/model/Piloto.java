package model;

public class Piloto extends Pessoa {

	String licensaPiloto;
	String uniforme;
	double cargaHoraria;

	public Piloto(String nome, int idade, String documento, String licensaPiloto, String uniforme,
			double cargaHoraria) {
		super(nome, idade, documento);
		this.licensaPiloto = licensaPiloto;
		this.uniforme = uniforme;
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public String toString() {
		return "Piloto [licensaPiloto=" + licensaPiloto + ", uniforme=" + uniforme + ", cargaHoraria=" + cargaHoraria
				+ "]";
	}

	public void pilotarAeronave() {
		System.out.println("pilotando");
	}

}
