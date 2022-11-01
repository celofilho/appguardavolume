package br.edu.infnet.appguardavolume.model.domain;

public class Bebida extends Volume {
	private int quantidade;
	private String marca;


	@Override
	public String toString() {
		return super.toString() + ";" + quantidade + ";" + marca;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
}