package br.senai.sp.jandira.repository;

import br.senai.sp.jandira.model.Jogo;

public class JogoRepository {

	private Jogo[] colecao;

	public JogoRepository() {
		this.colecao = new Jogo[50];
	}
	
	public JogoRepository(int quantidadeJogos) {
		this.colecao = new Jogo[quantidadeJogos];
	}

	public void gravar(Jogo jogo, int posicao) {
		colecao[posicao] = jogo;
	}
	
	public Jogo listarJogo(int posicao) {
		return colecao[posicao];
	}
	
	public Jogo[] listarTodos() {
		return colecao;
	}
	
	public int getLegth() {
		return colecao.length;
	}
}
