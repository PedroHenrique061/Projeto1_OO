package View;

/**
 Implementa uma interface para buscar a figurinha e o album.
 * @author Pedro Henrique Fernandino da Silva
 * @version 1.0 
 */

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import Controller.*;

public class TelaDeBusca implements ActionListener {

	private JFrame janela;
	private JLabel tituloFigurinhaJogador;
	private JTextField valorIdFigurinhaJogador;
	private JLabel tituloFigurinhaEstadio;
	private JTextField valorIdFigurinhaEstadio;
	private JLabel tituloAlbum;
	private JTextField valorIdAlbum;
	private JButton butao;
	private ControllerDados dados;
	private TelaFigurinha a;
	private TelaAlbum b;
	private int figurinhaJogador;
	private int figurinhaEstadio;
	private int album;
	int opcao;

	/**
	 * Permite o usuario digitar o id da figurinha e o nome do Album que deseja
	 * buscar
	 * 
	 * @param opcao define a opção de busca
	 *  (1) opcao = figurinha jogador 
	 *  (2) opcao = figurinha estadio 
	 *  (3) opcao = album de figurinhas
	 * @param dados
	 */
	public void mostrarTela(int opcao, ControllerDados dados) {
		this.dados = dados;
		this.opcao = opcao;

		janela = new JFrame("Busca de Figurinha e Album");
		tituloFigurinhaJogador = new JLabel(" ID da figurinha de jogador que deseja buscar:");
		tituloFigurinhaEstadio = new JLabel(" ID da figurinha de estádio que deseja buscar:");
		tituloAlbum = new JLabel(" Digite o ID do album que deseja buscar:");
		valorIdFigurinhaJogador = new JTextField(200);
		valorIdFigurinhaEstadio = new JTextField(200);
		valorIdAlbum = new JTextField(200);
		butao = new JButton("Buscar");

		tituloFigurinhaJogador.setBounds(15, 10, 350, 30);
		tituloFigurinhaEstadio.setBounds(15, 10, 350, 30);
		tituloAlbum.setBounds(15, 10, 350, 30);
		valorIdFigurinhaJogador.setBounds(115, 60, 90, 25);
		valorIdFigurinhaEstadio.setBounds(115, 60, 90, 25);
		valorIdAlbum.setBounds(115, 60, 90, 25);
		tituloFigurinhaJogador.setFont(new Font("Calibri", Font.BOLD, 16));
		tituloFigurinhaEstadio.setFont(new Font("Calibri", Font.BOLD, 16));
		tituloAlbum.setFont(new Font("Calibri", Font.BOLD, 16));
		butao.setBounds(230, 80, 90, 30);

		janela.setLayout(null);

		if (opcao == 1) {
			janela.add(tituloFigurinhaJogador);
			janela.add(valorIdFigurinhaJogador);

		}
		if (opcao == 2) {
			janela.add(tituloFigurinhaEstadio);
			janela.add(valorIdFigurinhaEstadio);

		}
		if (opcao == 3) {
			janela.add(tituloAlbum);
			janela.add(valorIdAlbum);

		}

		janela.add(butao);
		janela.setSize(450, 150);
		janela.setVisible(true);
		janela.setLocationRelativeTo(null);

		butao.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == butao) {
			if (opcao == 1) { // mostra a tela para busca de uma figurinha de jogador
				String idFigurinhaJogador = valorIdFigurinhaJogador.getText();
				figurinhaJogador = dados.encontrarFigurinhaJogador(idFigurinhaJogador);

				if (figurinhaJogador < 50000000) {
					new TelaDetalheFigurinha().cadastrarFigurinha(3, dados, a, figurinhaJogador);

				}
				else {
					mensagemErro();
				}
			}
			if (e.getSource() == butao) {
				if (opcao == 2) { // mostra a tela para busca de uma figurinha de estádio
					String idFigurinhaEstadio = valorIdFigurinhaEstadio.getText();
					figurinhaEstadio = dados.encontrarFigurinhaEstadio(idFigurinhaEstadio);
					if (figurinhaEstadio < 50000000) {
						new TelaDetalheFigurinha().cadastrarFigurinha(4, dados, a, figurinhaEstadio);
					}else {
						mensagemErro();
					}
				}
				if (e.getSource() == butao) {// mostra a tela para busca de um álbum
					if (opcao == 3) {
					String idAlbum = valorIdAlbum.getText();
					album = dados.encontrarAlbum(idAlbum);
					if (album < 50000000) {
						new TelaDetalheAlbum().cadastrarAlbum(2, dados, b, album);
					} 
					else {
						mensagemErro();
					}
				}
			}
		}
	}
	}
	// caso id
	public void mensagemErro() {
		JOptionPane.showMessageDialog(null, "O Id digitado não foi cadastrado!", null, JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

}