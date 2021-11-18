package br.senai.sp.jandira.model;

public enum Console {
	
	XBOX360("Xbox 360"), 
	XBOXONE("Xbox One"),
	XBOXS("Xbox S"),
	XBOXX("Xbox X"),
	PLAYSTATION3("Playstation 3"),
	PLAYSTATION4("Playstation 4"),
	PLAYSTATION5("Playstation 5"),
	NITENDOSWITCH("Nitendo Switch"),
	PC("PC"),
	OUTRO("Outro");

	private String descri��o;
	
	private Console(String descricao) {
		this.descri��o = descricao;
	}
	
	public String getDescri��o() {
		return this.descri��o;
	}
	
}
