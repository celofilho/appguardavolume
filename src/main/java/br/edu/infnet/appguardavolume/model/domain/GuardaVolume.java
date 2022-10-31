package br.edu.infnet.appguardavolume.model.domain;

import java.time.LocalDateTime;
import java.util.List;

public class GuardaVolume {
	private String descricao;
	private LocalDateTime data;

	public Condomino getCondomino() {
		return condomino;
	}

	public void setCondomino(Condomino condomino) {
		this.condomino = condomino;
	}

	public List<Volume> getVolumes() {
		return volumes;
	}

	public void setVolumes(List<Volume> volumes) {
		this.volumes = volumes;
	}

	private Condomino condomino;
	private List<Volume> volumes;

	public GuardaVolume() {
		data = LocalDateTime.now();
	}

	public GuardaVolume(Condomino condomino) {
		this();
		this.condomino = condomino;
	}


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