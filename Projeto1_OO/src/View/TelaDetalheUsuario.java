package View;

/**
 * Implementa uma interface para mostrar os detalhes de cada usuario cadastrados
 * e permitir a edição desses dados.
 * @author Pedro Henrique Fernandino da Silva
 * @version 1.0 
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import Controller.*;

public class TelaDetalheUsuario implements ActionListener{
	
	private JFrame janela;
	private JLabel labelNome = new JLabel("Nome: ");
	private JTextField valorNome;
	private JLabel labelCPF = new JLabel("CPF: ");
	private JTextField valorCPF;
	private JLabel labelTelefone = new JLabel("Telefone");
	private JTextField valorTelefone;
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	private String[] novoDado = new String[5];
	private ControllerDados dados;
	private int posicao;
	private int escolha;
	private String s;
	/**
	 * cadastra novos usuarios e mostra detalhes dos já existentes,
	 *  permitindo a edição desses dados
	 * @param opcao, representa a opcao escolhida pelo usuário
	 * (1) cadastro de usuario
	 * (2) detalhe de usuario
	 * @param dados, permite acesso aos dados dos usuarios
	 * @param posicao,posição do usuario escolhido na JList
	 */
	public void cadastrar(int opcao, ControllerDados dados, 
			TelaUsuario u, int pos){
		
		escolha = opcao;
		posicao = pos;
		this.dados = dados;
		
		if (opcao == 1) s = "Cadastro de Usuario";
		if (opcao == 2) s = "Detalhe de Usuario";
		
		janela = new JFrame(s);
		
		if (opcao == 2){
			
			valorNome = new JTextField(dados.getUsuario()[pos].getNome(), 200);
			valorCPF = new JTextField(String.valueOf(dados.getUsuario()[pos].getCpf()), 200);
			valorTelefone = new JTextField(String.valueOf(dados.getUsuario()[pos].getTelefone()), 200);
		} else { //Não preenche com dados

			valorNome = new JTextField(200);
			valorCPF = new JTextField(200);
			valorTelefone = new JTextField(200);

			botaoSalvar.setBounds(245, 175, 115, 30);
		}
		
		labelNome.setBounds(30, 20, 150, 25);
		valorNome.setBounds(180, 20, 180, 25);	
		labelCPF.setBounds(30, 50, 150, 25);
		valorCPF.setBounds(180, 50, 180, 25);
		labelTelefone.setBounds(30, 110, 150, 25);
		valorTelefone.setBounds(180, 110, 120, 25);

		//Coloca os campos relacionados ao usuario
		if (opcao == 2 ) {
			botaoSalvar.setBounds(120, 340, 115, 30);
			botaoExcluir.setBounds(245, 340, 115, 30);
			this.janela.add(botaoExcluir);

		}
		
		this.janela.add(labelNome);
		this.janela.add(valorNome);
		this.janela.add(labelCPF);
		this.janela.add(valorCPF);
		this.janela.add(labelTelefone);
		this.janela.add(valorTelefone);
		this.janela.add(botaoSalvar);
		this.janela.setLayout(null);

		this.janela.setSize(400, 430);
		this.janela.setVisible(true);
		this.janela.setLocationRelativeTo(null);

		botaoSalvar.addActionListener(this);
		botaoExcluir.addActionListener(this);
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource() == botaoSalvar) {
			try {
				boolean res = false;
				
				if(escolha == 1) //cadastro de novo usuario
					novoDado[0] = Integer.toString(dados.getQtdUsuarios());
				
				else // edicao de dado existente
					novoDado[0] = Integer.toString(posicao);

				/*
				 * salvar os dados inseridos no usuario cadastrado ou editado.
				 * 
				 */
				novoDado[1] =  valorNome.getText();
				novoDado[2] =  valorCPF.getText();
				novoDado[3] =  valorTelefone.getText();
				
				if (escolha == 1 || escolha == 2) {
					res = dados.cadastrarUsuario(novoDado);
				} 
				if(res) {
					mensagemSucessoCadastro();
				}
				else mensagemErroCadastro();

			} catch (NullPointerException exc1) {
				mensagemErroCadastro();
			} catch (NumberFormatException exc2) {
				mensagemErroCadastro();
			}
		}

		 //exclui o usuario selecionado
		if(e.getSource() == botaoExcluir) {
			boolean res = false;
			if (escolha == 2) {
				res = dados.deletarUsuario(posicao);
				if (res) mensagemSucessoExclusao(); 
			}	
		}
		
	}
	
	public void mensagemSucessoExclusao() {
		JOptionPane.showMessageDialog(null, "Os dados foram excluidos com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	public void mensagemSucessoCadastro() {
		JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	public void mensagemErroCadastro() {
		JOptionPane.showMessageDialog(null,"ERRO AO SALVAR OS DADOS!\n ", null,
				JOptionPane.ERROR_MESSAGE);
		janela.dispose();
	}
	
}
