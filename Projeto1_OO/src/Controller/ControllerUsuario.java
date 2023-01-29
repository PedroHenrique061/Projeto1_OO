package Controller;
/**
Implementa um controle para a classe de Usuario
* @author Pedro Henrique Fernandino da Silva
* @version 1.0 
*/
import Model.*;

public class ControllerUsuario {

	private Usuario[] usuario;
	private int qtdUsuarios;

	public ControllerUsuario(ControllerDados dados) {
		usuario = dados.getUsuario();
		qtdUsuarios = dados.getQtdUsuarios();

	}
	
	/**
	 * Armazena os nomes em um vetor de String
	 * @return String, um vetor de string com os nomes
	 */
	public String[] getNomeUsuario() {
		String[] s = new String[qtdUsuarios];
		for (int i = 0; i < qtdUsuarios; i++) {
			s[i] = usuario[i].getNome();
		}
		return s;
	}
}
