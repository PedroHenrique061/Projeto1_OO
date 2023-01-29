package View;

/**
 * Implementa uma interface para cadastrar, editar, atualizar e deletar as figurinhas.
 * @author Pedro Henrique Fernandino da Silva
 * @version 1.0 
 */

import java.awt.event.*;
import javax.swing.*;
import Controller.*;

public class TelaDetalheFigurinha implements ActionListener{
	
	
	
	private JFrame frame;
	private JLabel labelID = new JLabel("ID da Figurinha: ");
	private JTextField valorID;
	private JLabel labelNome = new JLabel("Nome: ");
	private JTextField valorNome;
	private JLabel labelPreco = new JLabel("Preço(R$): ");
	private JTextField valorPreco;
	private JLabel labelPosicao = new JLabel("Posição: ");
	private JTextField valorPosicao;
	private JLabel labelSelecao = new JLabel("Seleção: ");
	private JTextField valorSelecao;
	private JLabel labelAnoDeConstrucao = new JLabel("Ano de Construção: ");
	private JTextField valorAnoDeConstrucao;
	private JLabel labelCapacidade = new JLabel("Capacidade: ");
	private JTextField valorCapacidade;
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	private String booleanOpcoes[] = { "Sim", "Não"}; 
	private JLabel labelLendaria = new JLabel("Lendária");
	private JComboBox<String> trueFalse = new JComboBox<String> (booleanOpcoes);
	private String[] novoDado = new String[7];
	private ControllerDados dados;
	private int posicao;
	private int escolha;
	private String s;
	
	/**
	 * Cadastra ou edita a figurinha escolhida pelo usuario 
	 * @param escolha, é numero equivalente à operação que o usuario deseja fazer
	 * (1) Cadastro de figurinha de jogador
	 * (2) Cadastro de figurinha de estadio
	 * (3) Detalhes da figurinha de jogador
	 * (4) Detalhes da figurinha de estádio
	 * @param posicao = pos,posição do usuario escolhido na JList
	 */
	public void cadastrarFigurinha(int opcao, ControllerDados dados, 
			TelaFigurinha f, int pos) {

		escolha = opcao;
		posicao = pos;
		this.dados = dados;

		if (opcao == 1) s = "Cadastro de Figurinha de Jogador";
		if (opcao == 2) s = "Cadastro de Figurinha de Estádio";
		if (opcao == 3) s = "Detalhe de Figurinha de Jogador";
		if (opcao == 4) s = "Detalhe de figurinha de Estádio";

		frame = new JFrame(s);

		
		if (opcao == 3) { //Preenche dados com dados da figurinha de jogador selecionada
			valorNome = new JTextField(dados.getFigurinhaJogador()[pos].getNome(),200);
			valorID = new JTextField(String.valueOf(dados.getFigurinhaJogador()[pos].getId()), 200);
			valorSelecao = new JTextField(String.valueOf(dados.getFigurinhaJogador()[pos].getSelecao()), 200);
			valorPosicao = new JTextField(String.valueOf(dados.getFigurinhaJogador()[pos].getPosicao()), 200);
			valorPreco = new JTextField(String.valueOf(dados.getFigurinhaJogador()[pos].getPreco()), 200);
			trueFalse.setSelectedItem(dados.getFigurinhaJogador()[pos].getLendaria());

		} else if (opcao == 4) { //Preenche dados com dados da figurinha de estádio selecionada 
			valorNome = new JTextField(dados.getFigurinhaEstadios()[pos].getNome(), 200);
			valorID = new JTextField(String.valueOf(dados.getFigurinhaEstadios()[pos].getId()), 200);
			valorPreco = new JTextField(String.valueOf(dados.getFigurinhaEstadios()[pos].getPreco()), 200);
			valorAnoDeConstrucao = new JTextField(String.valueOf(dados.getFigurinhaEstadios()[pos].getAnoDeConstrucao()), 200);
			valorCapacidade = new JTextField(String.valueOf(dados.getFigurinhaEstadios()[pos].getCapacidade()), 200);
			trueFalse.setSelectedItem(dados.getFigurinhaEstadios()[pos].getLendaria());

		} else { //Não preenche com dados
			
			valorNome = new JTextField(200);
			valorID = new JTextField(200);
			valorPreco = new JTextField(200);
			valorSelecao = new JTextField(200); 
			valorPosicao = new JTextField(200);
			valorAnoDeConstrucao = new JTextField(200);
			valorCapacidade = new JTextField(200);
			botaoSalvar.setBounds(245, 400, 115, 30);
			  
		}

		labelNome.setBounds(30, 20, 150, 25);
		valorNome.setBounds(180, 20, 180, 25);
		labelID.setBounds(30, 110, 150, 25);
		valorID.setBounds(180, 110, 180, 25);
		labelPreco.setBounds(30, 170, 150, 25);
		valorPreco.setBounds(180, 170, 180, 25);
	
		
		//Insere na tela os campos relacionados a Figurinha de Jogador
		if (opcao == 3 || opcao == 1 ) {
			
			labelSelecao.setBounds(30, 230, 150, 25);
			valorSelecao.setBounds(180, 230, 180, 25);
			labelPosicao.setBounds(30, 260, 150, 25);
			valorPosicao.setBounds(180, 260, 180, 25);
			labelLendaria.setBounds(30, 290, 180, 25);
			trueFalse.setBounds(180, 290, 180, 25);
			
			
			this.frame.add(labelSelecao);
			this.frame.add(valorSelecao);
			this.frame.add(labelPosicao);
			this.frame.add(valorPosicao);
			this.frame.add(labelLendaria);
			
			this.frame.add(trueFalse);
			

		}

		//Insere na tela os campos relacionados a Figurinha de Estadio
		if ( opcao == 4 || opcao == 2 ) {
			
			labelAnoDeConstrucao.setBounds(30, 260, 150, 25);
			valorAnoDeConstrucao.setBounds(180, 260, 180, 25);
			labelCapacidade.setBounds(30, 230, 150, 25);
			valorCapacidade.setBounds(180, 230, 180, 25);
			labelLendaria.setBounds(30, 290, 150, 25);
			trueFalse.setBounds(180, 290, 180, 25);

			this.frame.add(labelAnoDeConstrucao);
			this.frame.add(valorAnoDeConstrucao);
			this.frame.add(labelCapacidade);
			this.frame.add(valorCapacidade);
			this.frame.add(labelLendaria);
			this.frame.add(trueFalse);
		}
		
		//Insere na tela os botoes de excluir e salvar
		if (opcao == 3 || opcao == 4 ) {
			botaoSalvar.setBounds(120, 400, 115, 30);
			botaoExcluir.setBounds(245, 400, 115, 30);
			this.frame.add(botaoExcluir);
		}

		this.frame.add(labelNome);
		this.frame.add(valorNome);
		this.frame.add(labelID);
		this.frame.add(valorID);
		this.frame.add(labelPreco);
		this.frame.add(valorPreco);
		this.frame.add(trueFalse);
		
		this.frame.add(botaoSalvar);
		

		this.frame.setLayout(null);

		this.frame.setSize(400, 500);
		this.frame.setVisible(true);
		this.frame.setLocationRelativeTo(null);

		botaoSalvar.addActionListener(this);
		botaoExcluir.addActionListener(this);
	}


	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == botaoSalvar) {
			try {
				boolean res = false;
				
				if(escolha == 1) //cadastro de uma nova figurinha de Jogador
					novoDado[0] = Integer.toString(dados.getQtdFigurinhasJogadores());
				else if (escolha == 2) // cadastro de nova figurinha de Estádio
					novoDado[0] = Integer.toString(dados.getQtdFigurinhasEstadios());
				else // edicao de dado existente
					novoDado[0] = Integer.toString(posicao);
				
				/*
				 * salvar os dados inseridos na figurinha cadstrada ou editada.
				 * 
				 */
				novoDado[1] =  valorNome.getText();
				novoDado[2] =  valorID.getText();
				novoDado[3] =  valorPreco.getText();
				
				

				if (escolha == 1 || escolha == 3) {//Figurinha Jogador
					novoDado[4] =  valorSelecao.getText();
					novoDado[5] = valorPosicao.getText();
					novoDado[6] = (String) trueFalse.getSelectedItem();
					res = dados.cadastrarFigurinhaJogador(novoDado);
				} else if (escolha == 2 || escolha == 4){//Figurinha Estadio
					novoDado[4] =  valorAnoDeConstrucao.getText();
					novoDado[5] =  valorCapacidade.getText();
					novoDado[6] = (String) trueFalse.getSelectedItem();
					
					res = dados.cadastrarFigurinhaEstadio(novoDado);
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

		if(e.getSource() == botaoExcluir) {
			boolean res = false;

			if (escolha == 3) {//exclui a Figurinha de jogador
				res = dados.deletarFigurinhaJogador(posicao);
				if (res) mensagemSucessoExclusao(); 
				else mensagemErroExclusao(); 
			}
				
			if (escolha == 4){ //exclui a Figurinha de Estádio
				res = dados.deletarFigurinhaEstadio(posicao);
				if (res) mensagemSucessoExclusao(); 
				else mensagemErroExclusao(); 
			}	
		}
	}
	

	public void mensagemSucessoExclusao() {
		JOptionPane.showMessageDialog(null, "Os dados foram excluidos com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		frame.dispose();
	}

	public void mensagemSucessoCadastro() {
		JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		frame.dispose();
	}

	public void mensagemErroCadastro() {
		JOptionPane.showMessageDialog(null,"ERRO AO SALVAR OS DADOS!\n ",
				null, JOptionPane.ERROR_MESSAGE);
	}
	
	 public void mensagemErroExclusao() {
		 JOptionPane.showMessageDialog(null,"Ocorreu um erro ao excluir o dado.\n ",
				 null, JOptionPane.ERROR_MESSAGE); 
	 }

	 
}