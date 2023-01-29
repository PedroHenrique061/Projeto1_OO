package View;

/**
 * @author Pedro Henrique Fernandino da Silva
 * @version 1.0 
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import Controller.*;

/**
 * Constroi uma tela de menu de figurinhas
 */
public class TelaMenuFigurinha implements ActionListener {
	
	private JFrame frame;
	private JLabel titulo;
	private JButton figurinhaJogador;
	private JButton figurinhaEstadio;
	private ControllerDados dados; 
	
	/**
	 * Mostra na tela uma lista de figurinhas cadastradas 
	 * @param dados permite o acesso aos dados das figurinhas
	 */
	
	public void mostrarFigurinhas(ControllerDados dados) {
		this.dados = dados;
	
		frame = new JFrame("Figurinhas");
		titulo = new JLabel("Figurinhas Cadastradas");
		figurinhaJogador = new JButton("Figurinha Jogador");
		figurinhaEstadio = new JButton("Figurinha Estádio");
		
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(90, 10, 250, 40);
		figurinhaJogador.setBounds(130, 70, 140, 20);
		figurinhaEstadio.setBounds(130, 120, 140, 20);
		
		frame.setLayout(null);
		
		frame.add(titulo);
		frame.add(figurinhaJogador);
		frame.add(figurinhaEstadio);
		frame.setSize(400, 250);
		frame.setVisible(true);

		frame.setLocationRelativeTo(null);//colocar a tela no meio;
	
		figurinhaJogador.addActionListener(this);
		figurinhaEstadio.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == figurinhaJogador)
			new TelaFigurinha().mostrarFigurinhas(dados,1);
		
		if(e.getSource() == figurinhaEstadio)
			new TelaFigurinha().mostrarFigurinhas(dados,2);

	}

}
