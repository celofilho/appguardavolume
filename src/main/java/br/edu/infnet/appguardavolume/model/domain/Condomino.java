package br.edu.infnet.appguardavolume.model.domain;

public class Condomino {
	public Integer getId() {
		return id;
	}

	private Integer id;
	private String nome;
	private String cpf;
	private String email;

	@Override
	public String toString() {
		return nome + ";" + cpf + ";" + email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}