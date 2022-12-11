package ClassesProjeto;

public class FigurinhaPiloto {
	
	private int id;
	private String nome;
	private String marcaCarro;
	private int velocidadeMaximaCarro;
	private boolean lendaria;
	private double preco;
	
	public FigurinhaPiloto() {
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
	public String getMarcaCarro() {
		return marcaCarro;
	}
	public void setMarcaCarro(String marcaCarro) {
		this.marcaCarro = marcaCarro;
	}
	public int getVelocidadeMaximaCarro() {
		return velocidadeMaximaCarro;
	}
	public void setVelocidadeMaximaCarro(int velocidadeMaximaCarro) {
		this.velocidadeMaximaCarro = velocidadeMaximaCarro;
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
		return "|----------FigurinhaPiloto----------|" + "\n" +
				"Id = " + id + "\n" +
				"Nome = " + nome + "\n" +
				"MarcaCarro = " + marcaCarro + "\n" +
				"VelocidadeMaximaCarro = " + velocidadeMaximaCarro + " KM/h " + "\n" +
				"Lendaria = " + lendaria + "\n" +
				"Preco = " +" R$ " + preco;
				
	}

}
