package Controller;

/**
* @author Pedro Henrique Fernandino da Silva
* @version 1.0 
*/

import Model.*;
 
/**
Implementa um controle de dados de todas as classes, além de implementar 
as funcionalidades minimas do código.
*/
public class ControllerDados {
	private Dados dados = new Dados();

	/**
	 * construtor da classe
	 */
	public ControllerDados() {
		dados.adicionarDados();
	}

	/**
	 * cadastra um album de figurinhas
	 * @param dadosAlbumFigurinhas, passa os dados do album.
	 * @return true ou false
	 */
	public boolean cadastrarAlbumFigurinhas(String[] dadosAlbumFigurinhas) {

		AlbumFigurinhas af = new AlbumFigurinhas(dadosAlbumFigurinhas[1],
				Integer.parseInt(dadosAlbumFigurinhas[2]),
				Integer.parseInt(dadosAlbumFigurinhas[3]), dadosAlbumFigurinhas[4], null);
		dados.cadastrarAlbumFigurinha(af, Integer.parseInt(dadosAlbumFigurinhas[0]));
		return true;
	}

	/**
	 * Deleta o álbum escolhido
	 * @param i, contador
	 * @return true ou false
	 */
	public boolean deletarAlbumFigurinhas(int i) {
		String albumFigurinhaDeletado = dados.getAlbumFigurinhas()[i].getId();

		if (i == (dados.getQtdAlbuns() - 1)) {
			dados.setQtdAlbuns(dados.getQtdAlbuns() - 1);
			dados.getAlbumFigurinhas()[dados.getQtdAlbuns()] = null;
			return true;
		} else {
			int cont = 0;
			while (dados.getAlbumFigurinhas()[cont].getId()
					.compareTo(albumFigurinhaDeletado) != 0)
				cont++;
			for (int j = cont; j < dados.getQtdAlbuns() - 1; j++) {
				dados.getAlbumFigurinhas()[j] = null;
				dados.getAlbumFigurinhas()[j] = dados.getAlbumFigurinhas()[j + 1];
			}
			dados.getAlbumFigurinhas()[dados.getQtdAlbuns()] = null;
			dados.setQtdAlbuns(dados.getQtdAlbuns() - 1);
			return true;

		}
	}

	/**
	 * cadastra uma figurinha de jogador,
	 * @param dadosFigurinhaJogador, passa os dados da figurinha de jogador
	 * @return true ou false
	 */
	public boolean cadastrarFigurinhaJogador(String[] dadosFigurinhaJogador) {

		FigurinhaJogador fj = new FigurinhaJogador(dadosFigurinhaJogador[2],
				dadosFigurinhaJogador[1], Double.parseDouble(dadosFigurinhaJogador[3]),
				dadosFigurinhaJogador[5], dadosFigurinhaJogador[4],
				dadosFigurinhaJogador[6]);

		dados.cadastrarFigurinhaJogador(fj, Integer.parseInt(dadosFigurinhaJogador[0]));
		return true;

	}

	/**
	 * Deleta a figurinha de jogador escolhida
	 * @param i, contador
	 * @return true ou false
	 */
	public boolean deletarFigurinhaJogador(int i) {
		String figurinhaJogadorDeletada = dados.getFigurinhaJogador()[i].getId();

		if (i == (dados.getQtdFigurinhasJogadores() - 1)) {
			dados.setQtdFigurinhasJogadores(dados.getQtdFigurinhasJogadores() - 1);
			dados.getFigurinhaJogador()[dados.getQtdFigurinhasJogadores()] = null;
			return true;
		} else {
			int cont = 0;
			while (dados.getFigurinhaJogador()[cont].getId()
					.compareTo(figurinhaJogadorDeletada) != 0) {
				cont++;
			}
			for (int j = cont; j < dados.getQtdFigurinhasJogadores() - 1; j++) {
				dados.getFigurinhaJogador()[j] = null;
				dados.getFigurinhaJogador()[j] = dados.getFigurinhaJogador()[j + 1];
			}
			dados.getFigurinhaJogador()[dados.getQtdFigurinhasJogadores()] = null;
			dados.setQtdFigurinhasJogadores(dados.getQtdFigurinhasJogadores() - 1);
			return true;
		}
	}

	/**
	 * cadastra uma figurinha de estadio,
	 * @param dadosFigurinhaEstadio, passa os dados da figurinha de estadio
	 * @return true ou false
	 */
	public boolean cadastrarFigurinhaEstadio(String[] dadosFigurinhaEstadio) {			
		FigurinhaEstadio fe = new FigurinhaEstadio(dadosFigurinhaEstadio[2],
				dadosFigurinhaEstadio[1], Double.parseDouble(dadosFigurinhaEstadio[3]),
				dadosFigurinhaEstadio[5], Double.parseDouble(dadosFigurinhaEstadio[4]),
				dadosFigurinhaEstadio[6]);
		dados.cadastrarFigurinhaEstadio(fe, Integer.parseInt(dadosFigurinhaEstadio[0]));

		return true;
	}

	/**
	 * Deleta a figurinha de estádio escolhida
	 * @param i,contador
	 * @return true ou false
	 */
	public boolean deletarFigurinhaEstadio(int i) {
		String figurinhaEstadioDeletada = dados.getFigurinhaEstadio()[i].getId();

		if (i == (dados.getQtdFigurinhasEstadios() - 1)) {
			dados.setQtdFigurinhasEstadios(dados.getQtdFigurinhasEstadios() - 1);
			dados.getFigurinhaEstadio()[dados.getQtdFigurinhasEstadios()] = null;
			return true;
		} else {
			int cont = 0;
			while (dados.getFigurinhaEstadio()[cont].getId()
					.compareTo(figurinhaEstadioDeletada) != 0) {
				cont++;
			}
			for (int j = cont; j < dados.getQtdFigurinhasEstadios() - 1; j++) {
				dados.getFigurinhaEstadio()[j] = null;
				dados.getFigurinhaEstadio()[j] = dados.getFigurinhaEstadio()[j + 1];
			}
			dados.getFigurinhaEstadio()[dados.getQtdFigurinhasEstadios()] = null;
			dados.setQtdFigurinhasEstadios(dados.getQtdFigurinhasEstadios() - 1);
			return true;
		}
	}

	/**
	 * Encontra uma figurinha de jogador através de seu id
	 * @param id, busca o id da figurinha já cadastrada
	 * @return, retorna a figurinha de jogador selecionada
	 */
	public int encontrarFigurinhaJogador(String id) {
		int figurinhaJogadorSelecionada= 0;
		for (int i = 0; i < dados.getQtdFigurinhasJogadores(); i++) {
			if (dados.getFigurinhaJogador()[i].getId().equals(id)) {
				figurinhaJogadorSelecionada = i;
				return figurinhaJogadorSelecionada;
			}
		}

		return 50000000;
	}

	/**
	 * Encontra uma figurinha de estádio através de seu id
	 * @param id, busca o id da figurinha já cadastrada
	 * @return, retorna a figurinha de estadio selecionada
	 */
	public int encontrarFigurinhaEstadio(String id) {
		int figurinhaEstadioSelecionada = 0;
		for (int i = 0; i < dados.getQtdFigurinhasEstadios(); i++) {
			if (dados.getFigurinhaEstadio()[i].getId().equals(id)) {
				figurinhaEstadioSelecionada = i;
				return figurinhaEstadioSelecionada;
			}
		}

		return 50000000;
	}
	/**
	 * Encontra um album de figurinhas através de seu id
	 * @param id, busca o id do album já cadastrado
	 * @return, retorna o albumSelecionado
	 */
	public int encontrarAlbum(String id) {
		int albumFigurinhasSelecionado = 0;
		for (int i = 0; i < dados.getQtdAlbuns(); i++) {
			if (dados.getAlbumFigurinhas()[i].getId().equals(id)) {
				albumFigurinhasSelecionado = i;
				return albumFigurinhasSelecionado;
			}
		}

		return 50000000;
	}


	public Dados getDados() {
		return dados;
	}

	public void setDados(Dados dados) {
		this.dados = dados;
	}

	public AlbumFigurinhas[] getAlbumFigurinhas() {
		return this.dados.getAlbumFigurinhas();
	}

	public int getQtdAlbumFigurinhas() {
		return this.dados.getQtdAlbuns();
	}

	public FigurinhaJogador[] getFigurinhaJogador() {
		return this.dados.getFigurinhaJogador();
	}

	public int getQtdFigurinhasJogadores() {
		return this.dados.getQtdFigurinhasJogadores();
	}

	public FigurinhaEstadio[] getFigurinhaEstadios() {
		return this.dados.getFigurinhaEstadio();
	}

	public int getQtdFigurinhasEstadios() {
		return this.dados.getQtdFigurinhasEstadios();
	}
}
