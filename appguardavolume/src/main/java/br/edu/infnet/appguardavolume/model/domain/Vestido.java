package br.edu.infnet.appguardavolume.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tvestido")
public class Vestido extends Volume {
	private boolean importado;
	private String tamanho;

	@Override
	public String toString() {
		return super.toString() + ";" + importado + ";" + tamanho;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public boolean isImportado() {
		return importado;
	}

	public void setImportado(boolean importado) {
		this.importado = importado;
	}
}