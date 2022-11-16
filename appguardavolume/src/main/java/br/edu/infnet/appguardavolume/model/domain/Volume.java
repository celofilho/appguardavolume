package br.edu.infnet.appguardavolume.model.domain;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tvolume")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Volume {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private float valor;
	private int codigo;

	@GetMapping(value = "/volume")
	public String telaCadastro() {
		return "volume/cadastro";
	}

	@ManyToMany(mappedBy = "volumes")
	private List<GuardaVolume> guardavolumes;
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;

	@Override
	public String toString() {
		return id + ";" + nome + ";" + valor + ";" + codigo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	public List<GuardaVolume> getGuardavolumes() {
		return guardavolumes;
	}

	public void setGuardavolumes(List<GuardaVolume> guardavolumes) {
		this.guardavolumes = guardavolumes;
	}

}