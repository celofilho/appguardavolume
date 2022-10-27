package br.edu.infnet.appguardavolume.model.domain;

import java.time.LocalDateTime;

public class GuardaVolume {
	private String descricao;
	private LocalDateTime data;
	
	@Override
	public String toString() {
		return descricao + ";" + data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}
}