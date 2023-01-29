package Model;

/**
Cria a classe de figurinha de jogador herdando da classe figurinha
* @author Pedro Henrique Fernandino da Silva
* @version 1.0 
*/

public class FigurinhaJogador extends Figurinha {

	private String posicao;
	private String selecao;
	private String lendaria;

	// construtor da classe
	public FigurinhaJogador(String posicao, String selecao) {
		this.posicao = posicao;
		this.selecao = selecao;
	}

	public FigurinhaJogador(String id, String nome, double preco, String posicao, String selecao, String lendaria) {

		this.setId(id);
		this.setNome(nome);
		this.setPreco(preco);
		this.posicao = posicao;
		this.selecao = selecao;
		this.lendaria = lendaria;
	}
	public String getLendaria() {
		return lendaria;
	}

	public void setLendaria(String lendaria) {
		this.lendaria = lendaria;
	}
	
	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	public String getSelecao() {
		return selecao;
	}
	public void setSelecao(String selecao) {
		this.selecao = selecao;
	}
	
	@Override
	public String toString() {
		return "|----------FigurinhaJogador----------|" + "\n" +
				"Id = " + getId() + "\n" +
				"Nome = " + getNome() + "\n" +
				"Posicao = " + posicao + "\n" +
				"Selecao = " + selecao + "\n" +
				"Lendaria = " + getLendaria() + "\n" +
				"Preco = " + "R$ " + getPreco() ;
	}
	
}
