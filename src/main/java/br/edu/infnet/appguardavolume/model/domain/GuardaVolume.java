package br.edu.infnet.appguardavolume.model.domain;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "tguardavolume")
public class GuardaVolume {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String descricao;
	private LocalDateTime data;

	@ManyToOne
	@JoinColumn(name = "idCondomino")
	private Condomino condomino;

	@OneToMany
	@JoinColumn(name = "idVolume")
	private List<Volume> volumes;


	public List<Volume> getVolumes() {
		return volumes;
	}

	public GuardaVolume() {
		data = LocalDateTime.now();
	}

	public GuardaVolume(Condomino condomino) {
		this();
		this.condomino = condomino;
	}

	@Override
	public String toString() {
		return id + ";" + descricao + ";" + data + ";" + condomino + ";" + volumes.size();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public void setVolumes(List<Volume> volumes) {
		this.volumes = volumes;
	}


	public Condomino getCondomino() {
		return condomino;
	}

	public void setCondomino(Condomino condomino) {
		this.condomino = condomino;
	}
}