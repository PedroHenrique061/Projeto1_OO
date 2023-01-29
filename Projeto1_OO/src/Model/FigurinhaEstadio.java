package Model;

/**
Cria a classe de figurinha de estadio herdando da classe figurinhas
* @author Pedro Henrique Fernandino da Silva
* @version 1.0 
*/

public class FigurinhaEstadio extends Figurinha{

	private String anoDeConstrucao;
	private double capacidade;
	private String lendaria;
	
	// construtor da classe
	public FigurinhaEstadio(String anoDeConstrucao, double capacidade){
		this.anoDeConstrucao = anoDeConstrucao;
		this.capacidade = capacidade;
	}
	public FigurinhaEstadio(String id, String nome, double preco, String anoDeConstrucao, double capacidade, String lendaria) {

		this.setId(id);
		this.setNome(nome);
		this.setPreco(preco);
		this.anoDeConstrucao = anoDeConstrucao;
		this.capacidade = capacidade;
		this.lendaria = lendaria;
		
	}

	public String getAnoDeConstrucao() {
		return anoDeConstrucao;
	}

	public void setAnoDeConstrucao(String anoDeConstrucao) {
		this.anoDeConstrucao = anoDeConstrucao;
	}

	public double getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(double capacidade) {
		this.capacidade = capacidade;
	}


	public String getLendaria() {
		return lendaria;
	}
	public void setLendaria(String lendaria) {
		this.lendaria = lendaria;
	}
	@Override
	public String toString() {
		return "|----------FigurinhaPiloto----------|" + "\n" +
				"Id = " + getId() + "\n" +
				"Nome = " + getNome() + "\n" +
				"Ano de construção = " + anoDeConstrucao + "\n" +
				"Capacidade de Torcedores = " + capacidade + "\n" +
				"Lendaria = " + getLendaria() + "\n" +
				"Preco = " +" R$ " + getPreco();
				
	}

}
