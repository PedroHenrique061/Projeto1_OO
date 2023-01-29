package View;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import Controller.*;

public class TelaFigurinha implements ActionListener, ListSelectionListener{
	
	private JFrame frame;
	private JLabel titulo;
	private JButton cadastroFigurinhaJogador;
	private JButton atualizarFigurinhaJogador;
	private JButton cadastroFigurinhaEstadio;
	private JButton atualizarFigurinhaEstadio;
	private JList<String> listaFigurinhasJogadoresCadastradas;
	private JList<String> listaFigurinhasEstadiosCadastradas;
	private ControllerDados dados;
	private String[] listaNomes = new String[50];

	/**
	 * Mostra as figurinhas cadastradas através de uma JList
	 * @param dados permite o acesso aos dados do álbum
	 * @param opcao define a opção de busca 
	 * (1) opcao = mostrar dados da figurinha jogador 
	 * (2) opcao = mostrar dados da figurinha estadio
	 */
	public void mostrarFigurinhas(ControllerDados dados, int opcao){
		this.dados = dados;

		switch (opcao) {
		case 1: // Mostrar dados de Figurinhas de Jogadores cadastradas
			listaNomes = new ControllerFigurinhaJogador(dados).getNomeFigurinhaJogador();
			listaFigurinhasJogadoresCadastradas = new JList<String>(listaNomes);
			frame = new JFrame("Figurinhas de Jogadores");
			titulo = new JLabel("Figurinhas de Jogadores Cadastradas");
			cadastroFigurinhaJogador = new JButton("Cadastrar");
			atualizarFigurinhaJogador = new JButton("Atualizar");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaFigurinhasJogadoresCadastradas.setBounds(20, 50, 350, 120);
			listaFigurinhasJogadoresCadastradas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaFigurinhasJogadoresCadastradas.setVisibleRowCount(10);

			cadastroFigurinhaJogador.setBounds(70, 177, 100, 30);
			atualizarFigurinhaJogador.setBounds(200, 177, 100, 30);

			frame.setLayout(null);

			frame.add(titulo);
			frame.add(listaFigurinhasJogadoresCadastradas);
			frame.add(cadastroFigurinhaJogador);
			frame.add(atualizarFigurinhaJogador);

			frame.setSize(400, 300);
			frame.setVisible(true);
			frame.setLocationRelativeTo(null);//colocar a tela no meio;
			

			cadastroFigurinhaJogador.addActionListener(this);
			atualizarFigurinhaJogador.addActionListener(this);
			listaFigurinhasJogadoresCadastradas.addListSelectionListener(this);

			break;

		case 2:// Mostrar dados de Figurinhas de Estádios cadastradas 
			listaNomes = new ControllerFigurinhaEstadio(dados).getNomeFigurinhaEstadio();
			listaFigurinhasEstadiosCadastradas = new JList<String>(listaNomes);
			frame = new JFrame("Figurinhas de Estádio");
			titulo = new JLabel("Figurinhas de Estádio Cadastradas");
			cadastroFigurinhaEstadio = new JButton("Cadastrar");
			atualizarFigurinhaEstadio = new JButton("Atualizar");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaFigurinhasEstadiosCadastradas.setBounds(20, 50, 350, 120);
			listaFigurinhasEstadiosCadastradas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaFigurinhasEstadiosCadastradas.setVisibleRowCount(10);


			cadastroFigurinhaEstadio.setBounds(70, 177, 100, 30);
			atualizarFigurinhaEstadio.setBounds(200, 177, 100, 30);

			frame.setLayout(null);

			frame.add(titulo);
			frame.add(listaFigurinhasEstadiosCadastradas);
			frame.add(cadastroFigurinhaEstadio);
			frame.add(atualizarFigurinhaEstadio);

			frame.setSize(400, 300);
			frame.setVisible(true);
			frame.setLocationRelativeTo(null);

			cadastroFigurinhaEstadio.addActionListener(this);
			atualizarFigurinhaEstadio.addActionListener(this);
			listaFigurinhasEstadiosCadastradas.addListSelectionListener(this);
			break;
			
		default:
			JOptionPane.showMessageDialog(null,"Opção não encontrada!", null, 
					JOptionPane.ERROR_MESSAGE);
		}

	}



	//Captura eventos relacionados aos botões da interface
	public void actionPerformed(ActionEvent e) {
		
		//Cadastro de uma nova figurinha de jogador
		if(e.getSource() == cadastroFigurinhaJogador)
			new TelaDetalheFigurinha().cadastrarFigurinha(1, dados, this, 0);

		//Cadastro de uma nova figurinha de estádio
		if(e.getSource() == cadastroFigurinhaEstadio)
			new TelaDetalheFigurinha().cadastrarFigurinha(2, dados, this, 0);
		

		// Atualiza a lista de nomes de figurinhas de jogadores 
		if(e.getSource() == atualizarFigurinhaJogador) {
			listaFigurinhasJogadoresCadastradas.setListData(new ControllerFigurinhaJogador(dados).getNomeFigurinhaJogador());			
			listaFigurinhasJogadoresCadastradas.updateUI();
		}

		// Atualiza a lista de nomes de figurinhas de estadio
		if(e.getSource() == atualizarFigurinhaEstadio) {
			listaFigurinhasEstadiosCadastradas.setListData(new ControllerFigurinhaEstadio(dados).getNomeFigurinhaEstadio());
			listaFigurinhasEstadiosCadastradas.updateUI();
		}

	}

	//Captura eventos relacionados ao JList
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if(e.getValueIsAdjusting() && src == listaFigurinhasJogadoresCadastradas) {
			new TelaDetalheFigurinha().cadastrarFigurinha(3, dados, this, 
					listaFigurinhasJogadoresCadastradas.getSelectedIndex());
		}

		if(e.getValueIsAdjusting() && src == listaFigurinhasEstadiosCadastradas) {
			new TelaDetalheFigurinha().cadastrarFigurinha(4, dados, this, 
					listaFigurinhasEstadiosCadastradas.getSelectedIndex());
		}
		
	}

}