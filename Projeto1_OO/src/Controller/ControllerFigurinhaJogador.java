package Controller;

/**
Implementa um controle para a classe de Figurinha de Jogador
* @author Pedro Henrique Fernandino da Silva
* @version 1.0 
*/

import Model.*;
 
public class ControllerFigurinhaJogador {

	private FigurinhaJogador[] figurinhaJogador;
	private int qtdFigurinhasJogador;
	

	public ControllerFigurinhaJogador(ControllerDados dados) {
		figurinhaJogador = dados.getFigurinhaJogador();
		qtdFigurinhasJogador = dados.getQtdFigurinhasJogadores();

	}
	
	public String[] getNomeFigurinhaJogador() {
		String[] s = new String[qtdFigurinhasJogador];
		for (int i = 0; i < qtdFigurinhasJogador; i++) {
			s[i] = figurinhaJogador[i].getNome();
		}

		return s;
	}

}