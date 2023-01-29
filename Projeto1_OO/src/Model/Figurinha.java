package Model;

/**
Cria a classe abstrata de figurinha 
* @author Pedro Henrique Fernandino da Silva
* @version 1.0 
*/

public abstract class Figurinha {

	private String id;
	private String nome;
	private boolean lendaria;
	private double preco;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isLendaria() {
		return lendaria;
	}

	public void setLendaria(boolean lendaria) {
		this.lendaria = lendaria;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
