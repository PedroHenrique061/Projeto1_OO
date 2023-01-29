package Controller;

/**
Implementa um controle para a classe de Figurinha de Estádio
* @author Pedro Henrique Fernandino da Silva
* @version 1.0 
*/

import Model.*;

public class ControllerFigurinhaEstadio {

	private FigurinhaEstadio[] figurinhaEstadio;
	private int qtdFigurinhasEstadios;
	

	public ControllerFigurinhaEstadio(ControllerDados dados) {
		this.figurinhaEstadio= dados.getFigurinhaEstadios();
		this.qtdFigurinhasEstadios = dados.getQtdFigurinhasEstadios();

	}
	
	public String[] getNomeFigurinhaEstadio() {
		String[] s = new String[qtdFigurinhasEstadios];
		for (int i = 0; i < qtdFigurinhasEstadios; i++) {
			s[i] = figurinhaEstadio[i].getNome();
		}

		return s;
	}
}
