package br.senai.sp.jandira.model;

public class Jogo {

	private String titulo;
	private Fabricante fabricante;
	private boolean zerado;
	private Console console;
	private double valor;
	private String observacao;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public boolean isZerado() {
		return zerado;
	}

	public void setZerado(boolean zerado) {
		this.zerado = zerado;
	}

	public Console getConsole() {
		return console;
	}

	public void setConsole(Console console) {
		this.console = console;
	}

	public String getValor() {
		String valorString = String.valueOf(this.valor);
		return valorString; 
	}

	public void setValor(String valorString) {
		double valor = Double.parseDouble(valorString);
		this.valor = valor;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

}
