package View;

/**
 * Implementa uma interface para mostrar os álbuns cadastrados.
 * @author Pedro Henrique Fernandino da Silva
 * @version 1.0 
 */

import Controller.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class TelaAlbum implements ActionListener, ListSelectionListener{

	private JFrame janela;
	private JLabel tituloAlbum;
	private JButton cadastroAlbum;
	private JButton atualizaAlbum;
	private JList<String> listaAlbunsCadastrados;
	private ControllerDados dados;
	private String[] listaIds = new String[50];

	/**
	 * Mostra os álbuns cadastrados através de uma JList
	 * @param dados permite o acesso aos dados do álbum
	 */
	public void mostrarDados(ControllerDados dados){
		
		this.dados = dados;
		
		listaIds = new ControllerAlbumFigurinhas(dados).getIdAlbumFigurinha();
		listaAlbunsCadastrados = new JList<String>(listaIds);
		janela = new JFrame("Albuns");
		tituloAlbum = new JLabel("Albuns Cadastrados");
		cadastroAlbum = new JButton("Cadastrar");
		atualizaAlbum = new JButton("Atualizar");
		tituloAlbum.setFont(new Font("Calibri", Font.BOLD, 18));
		tituloAlbum.setBounds(120, 10, 250, 30);
		listaAlbunsCadastrados.setBounds(20, 50, 350, 120);
		listaAlbunsCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaAlbunsCadastrados.setVisibleRowCount(10);
		cadastroAlbum.setBounds(70, 177, 100, 30);
		atualizaAlbum.setBounds(200, 177, 100, 30);
		janela.setLayout(null);
		
		janela.add(tituloAlbum);
		janela.add(cadastroAlbum);
		janela.add(atualizaAlbum);
		janela.add(listaAlbunsCadastrados);
		janela.setSize(400, 300);
		janela.setVisible(true);
		janela.setLocationRelativeTo(null);
		
		cadastroAlbum.addActionListener(this);
		atualizaAlbum.addActionListener(this);
		listaAlbunsCadastrados.addListSelectionListener(this);
	
	}
	
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		
		if(e.getValueIsAdjusting() && e.getSource() == listaAlbunsCadastrados) {
			new TelaDetalheAlbum().cadastrarAlbum(2, dados, this,
					listaAlbunsCadastrados.getSelectedIndex());
		}
	
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		//Cadastro de novo álbum
		if(e.getSource() == cadastroAlbum)
			new TelaDetalheAlbum().cadastrarAlbum(1, dados, this, 0);
		
		// Atualiza a lista de id de albuns mostrada no JList
		if(e.getSource() == atualizaAlbum) {
			ControllerAlbumFigurinhas figurinhas = new ControllerAlbumFigurinhas(dados);
			listaAlbunsCadastrados.setListData(figurinhas.getIdAlbumFigurinha());		
			listaAlbunsCadastrados.updateUI();
		}
		
	}
}
