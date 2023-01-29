package View;

/**
 * @author Pedro Henrique Fernandino da Silva
 * @version 1.0
*/
import java.awt.event.*;
import javax.swing.*;
import Controller.*;

public class TelaDetalheAlbum implements ActionListener{
	
	private JFrame frame;
	private JLabel labelID = new JLabel("ID do Album: ");
	private JTextField valorID;
	private JLabel labelQtdPaginas = new JLabel("Quantidade de Páginas: ");
	private JTextField valorQtdPaginas;
	private JLabel labelQtdFigurinhas = new JLabel("Quantidade de figurinhas: ");
	private JTextField valorQtdFigurinhas;
	private JLabel labelNome = new JLabel("Nome: ");
	private JTextField valorNome;
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	private String[] novoDado = new String[6];
	private ControllerDados dados;
	private int posicao;
	private int escolha;
	private String s;
	
	/**
	 * Cadastra ou edita o álbum escolhido pelo usuario 
	 * @param escolha, é numero equivalente à operação que o usuario deseja fazer
	 * (1) Cadastro de um novo álbum
	 * (2) Detalhes do álbum
	 */
	public void cadastrarAlbum(int opcao, ControllerDados dados, 
			TelaAlbum a, int pos) {

		escolha = opcao;
		posicao = pos;
		this.dados = dados;

		if (opcao == 1) s = "Cadastro de Album de Figurinhas";
		if (opcao == 2) s = "Detalhe de Album de Figurinhas";

		frame = new JFrame(s);

		
		if (opcao == 2) { //Preenche dados com dados do álbum de figurinhas selecionada
		
			valorID = new JTextField(String.valueOf(dados.getAlbumFigurinhas()[pos].getId()), 200);
			valorQtdPaginas = new JTextField(String.valueOf(dados.getAlbumFigurinhas()[pos].getQuantidadePaginas()), 200);
			valorQtdFigurinhas = new JTextField(String.valueOf(dados.getAlbumFigurinhas()[pos].getQuantidadeFigurinhas()), 200);
			valorNome = new JTextField(dados.getAlbumFigurinhas()[pos].getNome(),200);

		} else { //Não preenche com dados
			
			valorID = new JTextField(200);
			valorQtdPaginas = new JTextField(200);
			valorQtdFigurinhas= new JTextField(200);
			valorNome = new JTextField(200);
			
			botaoSalvar.setBounds(245, 400, 115, 30);
			  
		}

		labelID.setBounds(30, 110, 150, 25);
		valorID.setBounds(180, 110, 180, 25);
		labelQtdPaginas.setBounds(30, 170, 150, 25);
		valorQtdPaginas.setBounds(180, 170, 180, 25);
		labelQtdFigurinhas.setBounds(30, 210, 150, 25);
		valorQtdFigurinhas.setBounds(180, 210, 180, 25);
		labelNome.setBounds(30, 20, 150, 25);
		valorNome.setBounds(180, 20, 180, 25);
	
		
		//Insere os campos relacionados ao Album de Figurinhas
		if (opcao == 2 ) {
			botaoSalvar.setBounds(120, 340, 115, 30);
			botaoExcluir.setBounds(245, 340, 115, 30);
			this.frame.add(botaoExcluir);
		}	

			this.frame.add(labelID);
			this.frame.add(valorID);
			this.frame.add(labelQtdPaginas);
			this.frame.add(valorQtdPaginas);
			this.frame.add(labelQtdFigurinhas);
			this.frame.add(valorQtdFigurinhas);
			this.frame.add(labelNome);
			this.frame.add(valorNome);		
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
				
				if(escolha == 1) //cadastro de um novo álbum
					novoDado[0] = Integer.toString(dados.getQtdAlbumFigurinhas());
				else // edicao de dado existente
					novoDado[0] = Integer.toString(posicao);
				/*
				 * salvar os dados inseridos no álbum cadastrado ou editado
				 * 
				 */	
				novoDado[1] =  valorID.getText();
				novoDado[2] =  valorQtdPaginas.getText();
				novoDado[3] =  valorQtdFigurinhas.getText();
				novoDado[4] =  valorNome.getText();

				if (escolha == 1 || escolha == 2) {
					res = dados.cadastrarAlbumFigurinhas(novoDado);
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
			if (escolha == 2) {//exclui o Album de Figurinha selecionado
				res = dados.deletarAlbumFigurinhas(posicao);
				
				if (res) mensagemSucessoExclusao();
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