package br.senai.sp.jandira.model;

public class Fabricante {

	private String nome;
	private String sede;
	private String anoFundacao;

	public Fabricante(String nome, String sede, String anoFundacao) {
		this.nome = nome;
		this.sede = sede;
		this.anoFundacao = anoFundacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSede() {
		return sede;
	}

	public void setSede(String sede) {
		this.sede = sede;
	}

	public String getDataFundacao() {
		return anoFundacao;
	}

	public void setAnoFundacao(String anoFundacao) {
		this.anoFundacao = anoFundacao;
	}
	
}
