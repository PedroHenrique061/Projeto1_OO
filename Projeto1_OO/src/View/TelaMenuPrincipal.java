package View;

/**
 * @author Pedro Henrique Fernandino da Silva
 * @version 1.0 
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import Controller.ControllerDados;

	/**
	 * Constroi uma tela de menu para o usuario realizar a ação que deseja. 
 	*/
	public class TelaMenuPrincipal implements ActionListener{

	private JFrame frame1 = new JFrame("Controle de Album de Figurinha");
	private JLabel titulo = new JLabel("Menu Principal");
	private static JButton usuario = new JButton("Usuário");
	private static JButton figurinha = new JButton("Figurinha");
	private static JButton buscarFigurinhaJogador = new JButton("Buscar Figurinha de Jogador");
	private static JButton buscarFigurinhaEstadio = new JButton("Buscar Figurinha de Estádio");
	private static JButton buscarAlbumFigurinhas = new JButton("Buscar Album de Figurinhas");
	private static JButton albumFigurinhas = new JButton("Album de Figurinhas");
	
	private ControllerDados dados = new ControllerDados();
	
	/** 
	 * Construtor da classe
	 */
	public TelaMenuPrincipal() {
		titulo.setFont(new Font("Calibri", Font.BOLD, 20));
		titulo.setBounds(125, 10, 150, 30);
		usuario.setBounds(125, 50, 150, 30);
		figurinha.setBounds(125, 100, 150, 30);
		albumFigurinhas.setBounds(125, 150, 150, 30);
		buscarFigurinhaJogador.setBounds(95, 200, 200, 30);
		buscarFigurinhaEstadio.setBounds(95, 250, 200, 30);
		buscarAlbumFigurinhas.setBounds(95, 300, 200, 30);
		//setBounds ----> serve para dimensionar frame
		//e as suas respectivas distâncias;
		
		
		frame1.setLayout(null);
		
		frame1.add(titulo);
		frame1.add(usuario);
		frame1.add(figurinha);
		frame1.add(albumFigurinhas);
		frame1.add(buscarFigurinhaJogador);
		frame1.add(buscarFigurinhaEstadio);
		frame1.add(buscarAlbumFigurinhas);
		
		frame1.setSize(400, 400);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setLocationRelativeTo(null);//colocar a tela no meio;
		frame1.setVisible(true);//visualizar a tela;
		
	}
	/** 
	 *  Método de execução do menu principal
	 * @param args, args é um array que recebe dados da linha de comando.
	 */
	public static void main(String[] args) {
		TelaMenuPrincipal menu = new TelaMenuPrincipal();
		
		usuario.addActionListener(menu);
		figurinha.addActionListener(menu);
		albumFigurinhas.addActionListener(menu);
		buscarFigurinhaJogador.addActionListener(menu);
		buscarFigurinhaEstadio.addActionListener(menu);
		buscarAlbumFigurinhas.addActionListener(menu);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == usuario)
			new TelaUsuario().mostrarDados(dados);

		if(e.getSource() == figurinha)
			new TelaMenuFigurinha().mostrarFigurinhas(dados);

		if(e.getSource() == albumFigurinhas)
			new TelaAlbum().mostrarDados(dados);
		
		if(e.getSource() == buscarFigurinhaJogador)
			new TelaDeBusca().mostrarTela(1,dados);	
		
		if(e.getSource() == buscarFigurinhaEstadio)
			new TelaDeBusca().mostrarTela(2,dados);
		
		if(e.getSource() == buscarAlbumFigurinhas)
			new TelaDeBusca().mostrarTela(3,dados);
	}

	}

	
		
	
