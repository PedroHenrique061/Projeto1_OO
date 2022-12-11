package ClassesProjeto;

public class FigurinhaJogador {

	private int id;
	private String nome;
	private String posicao;
	private String selecao;
	private boolean lendaria;
	private double preco;
	
	public FigurinhaJogador() {
		toString();	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
	@Override
	public String toString() {
		return "|----------FigurinhaJogador----------|" + "\n" +
				"Id = " + id + "\n" +
				"Nome = " + nome + "\n" +
				"Posicao = " + posicao + "\n" +
				"Selecao = " + selecao + "\n" +
				"Lendaria = " + lendaria + "\n" +
				"Preco = " + "R$ " + preco ;
	}
	
}
