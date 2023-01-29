package View;

import Controller.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;



public class TelaUsuario implements ActionListener, ListSelectionListener{

	private JFrame janela;
	private JLabel tituloUsuario;
	private JButton cadastroUsuario;
	private JButton atualizaUsuario;
	private ControllerDados dados;
	private JList<String> listaUsuariosCadastrados;
	private String[] listaNomes = new String[50];

	/**
	 * Mostra os usuarios cadastrados através de uma JList
	 * @param dados permite o acesso aos dados do usuario
	 */
	public void mostrarDados(ControllerDados dados){
		
		this.dados = dados;
		listaNomes = new ControllerUsuario(dados).getNomeUsuario();
		listaUsuariosCadastrados = new JList<String>(listaNomes);
		janela = new JFrame("Usuarios");
		tituloUsuario = new JLabel("Usuarios Cadastrados");
		cadastroUsuario = new JButton("Cadastrar");
		atualizaUsuario = new JButton("Atualizar");
		tituloUsuario.setFont(new Font("Calibri", Font.BOLD, 18));
		tituloUsuario.setBounds(120, 10, 250, 30);
		listaUsuariosCadastrados.setBounds(20, 50, 350, 120);
		listaUsuariosCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaUsuariosCadastrados.setVisibleRowCount(10);
		cadastroUsuario.setBounds(70, 177, 100, 30);
		atualizaUsuario.setBounds(200, 177, 100, 30);
		janela.setLayout(null);
		
		janela.add(tituloUsuario);
		janela.add(cadastroUsuario);
		janela.add(atualizaUsuario);
		janela.add(listaUsuariosCadastrados);
		janela.setSize(400, 300);
		janela.setVisible(true);
		janela.setLocationRelativeTo(null);
		
		cadastroUsuario.addActionListener(this);
		atualizaUsuario.addActionListener(this);
		listaUsuariosCadastrados.addListSelectionListener(this);
	
	}
	
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		
		if(e.getValueIsAdjusting() && e.getSource() == listaUsuariosCadastrados) {
			new TelaDetalheUsuario().cadastrar(2, dados, this, 
					listaUsuariosCadastrados.getSelectedIndex());
		}
	
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		//Cadastro de novo usuario
		if(e.getSource() == cadastroUsuario)
			new TelaDetalheUsuario().cadastrar(1, dados, this, 0);
		
		// Atualiza a lista de nomes de usuario mostrada no JList
		if(e.getSource() == atualizaUsuario) {
			listaUsuariosCadastrados.setListData(new ControllerUsuario(dados).getNomeUsuario());		
			listaUsuariosCadastrados.updateUI();
		}
		
	}
}
