package Controller;

/**
Implementa um controle para a classe de Albuns de Figurinhas
* @author Pedro Henrique Fernandino da Silva
* @version 1.0 
*/

import Model.*;
 
public class ControllerAlbumFigurinhas {

	private AlbumFigurinhas[] albumFigurinha = new AlbumFigurinhas[50];
	private int qtdAlbuns;
	
	 public ControllerAlbumFigurinhas(ControllerDados dados) {
		albumFigurinha = dados.getAlbumFigurinhas();
		qtdAlbuns = dados.getQtdAlbumFigurinhas();

	}
	
	public String[] getIdAlbumFigurinha() {
		String[] s = new String[qtdAlbuns];
		for (int i = 0; i < qtdAlbuns; i++) {
			s[i] = albumFigurinha[i].getId();
		}

		return s;
	}

}