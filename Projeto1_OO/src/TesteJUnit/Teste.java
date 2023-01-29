package TesteJUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Controller.ControllerDados;

/**
 * @author Pedro Henrique Fernandino da Silva
 * @version 1.0 
 */
public class Teste {

	ControllerDados dados = new ControllerDados();
	String[] novoDado = new String[7];
	
	/**
	 * Verifica se o parametro 2, representando a posição do usuario no array, 
	 * funciona para o método em questão 
	 * @return void
	 */
	@Test
	public void testDeletarUsuario() {
		assertTrue(dados.deletarUsuario(2));
	}
		/**
		 * Verifica se o parametro novoDado, representando novos dados
		 * para o objeto figurinha de jogador
		 * funciona para o método em questão 
		 * @return void
		 */
	
	@Test
	public void testCadastrarFigurinhaJogador() {
		novoDado[0] = "0";
		novoDado[1] =  "100";
		novoDado[2] =  "Casemiro0";
		novoDado[3] =  "1.25";
		novoDado[4] =  "Volante";
		novoDado[5] =  "Brasil";
		novoDado[6] =  "Sim";
		assertTrue(dados.cadastrarFigurinhaJogador(novoDado));
	}
	/**
	 * Verifica se o método em questão está funcionando corretamente, dado os parametros
	 * @return void
	 */
	@Test
	public void testEncontrarAlbum() {
		assertEquals(0,dados.encontrarAlbum("010") );
	}
	
}
