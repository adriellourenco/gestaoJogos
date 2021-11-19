package br.senai.sp.jandira.repository;

import br.senai.sp.jandira.model.Fabricante;

public class FabricanteRepository {

	private Fabricante[] fabricantes;

	public FabricanteRepository() {
		this.fabricantes = new Fabricante[12];

		fabricantes[0] = new Fabricante("Nintendo", "Quioto, Quioto, Jap�o", "1889");
		fabricantes[1] = new Fabricante("Rockstar Games", "Nova Iorque, Nova York, EUA", "1998");
		fabricantes[2] = new Fabricante("Electronic Arts", "Redwood City, Calif�rnia, EUA", "1982");
		fabricantes[3] = new Fabricante("Ubisoft", "Montreuil, Fran�a", "1986");
		fabricantes[4] = new Fabricante("Sony Computer Entertainment", "San Mateo, Calif�rnia, EUA", "1993");
		fabricantes[5] = new Fabricante("Capcom Company", "Osaka, Osaka, Jap�o", "1979");
		fabricantes[6] = new Fabricante("Epic Games", "Cary, Carolina do Norte, EUA", "1991");
		fabricantes[7] = new Fabricante("Activision Blizzard", "Santa M�nica, Calif�rnia, EUA", "2008");
		fabricantes[8] = new Fabricante("Valve Corporation", "Bellevue, Washington, EUA", "1996");
		fabricantes[9] = new Fabricante("Mojang", "Estocolmo, Su�cia", "2009");
		fabricantes[10] = new Fabricante("Bethesda Softworks", "Rockville, Maryland, EUA", "1986");
		fabricantes[11] = new Fabricante("Outro", null, null);
	}

	public Fabricante[] getFabricantes() {
		return fabricantes;
	}

	public void setFabricantes(Fabricante[] fabricantes) {
		this.fabricantes = fabricantes;
	}
	
	public Fabricante listarFabricante(int posicao) {
		return fabricantes[posicao];
	}
	
	public Fabricante[] listarTodos() {
		return fabricantes;
	}
	
	public int getLegth() {
		return fabricantes.length;
	}
}
