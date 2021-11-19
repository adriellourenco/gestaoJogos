package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Console;
import br.senai.sp.jandira.model.Jogo;
import br.senai.sp.jandira.repository.FabricanteRepository;
import br.senai.sp.jandira.repository.JogoRepository;
import br.senai.sp.jandira.ui.FrameGestaoJogos;

public class App {

	public static void main(String[] args) {
		FrameGestaoJogos frame = new FrameGestaoJogos();
		frame.setVisible(true);
		
		/*FabricanteRepository fabricantesteste = new FabricanteRepository();
		JogoRepository colecaoTeste = new JogoRepository();
		
		Jogo gtav = new Jogo("GTAV", fabricantesteste.listarFabricante(0), true, Console.PC, 250, "Muito legal!");
		Jogo forza = new Jogo("Forza", fabricantesteste.listarFabricante(1), true, Console.XBOXONE, 300, "Muito Top!");
		Jogo zelda = new Jogo("Zelda", fabricantesteste.listarFabricante(1), true, Console.NITENDOSWITCH, 500, "Muito legal!");
		
		colecaoTeste.gravar(gtav, 0);
		colecaoTeste.gravar(zelda, 1);
		colecaoTeste.gravar(forza, 2);
		
		for (Jogo jogo : colecaoTeste.listarTodos()) {
			System.out.println(jogo.getTitulo());
			System.out.println(jogo.getFabricante().getNome());
			System.out.println(jogo.getConsole());
			System.out.println(jogo.getValor());
			System.out.println(jogo.isZerado());
			System.out.println(jogo.getObservacao());
			System.out.println("----------------------");
			System.out.println();
		}*/
	}

}
