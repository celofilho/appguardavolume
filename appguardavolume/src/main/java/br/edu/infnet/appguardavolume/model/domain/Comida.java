package br.edu.infnet.appguardavolume.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tcomida")
public class Comida extends Volume {
	private float peso;
	private boolean perecivel;

	@Override
	public String 	toString() {
		return super.toString() + ";" + peso + ";" + perecivel;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public boolean isPerecivel() {
		return perecivel;
	}

	public void setPerecivel(boolean perecivel) {
		this.perecivel = perecivel;
	}
}