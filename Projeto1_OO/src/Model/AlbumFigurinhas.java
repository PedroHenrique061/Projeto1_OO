package Model;

/**
Cria a classe de album de figurinhas
* @author Pedro Henrique Fernandino da Silva
* @version 1.0 
*/

import java.util.List;

public class AlbumFigurinhas{
	
	private String id;
	private int quantidadePaginas;
	private int quantidadeFigurinhas;
	private String nome;
	private List<Figurinha> figurinha;

	// construtor da classe
	public AlbumFigurinhas(String id, int quantidadePaginas, int quantidadeFigurinhas, 
			String nome,List<Figurinha> figurinha) {
		this.id = id;
		this.quantidadePaginas = quantidadePaginas;
		this.quantidadeFigurinhas = quantidadeFigurinhas;
		this.nome = nome;
		this.figurinha = figurinha;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getQuantidadePaginas() {
		return quantidadePaginas;
	}

	public void setQuantidadePaginas(int quantidadePaginas) {
		this.quantidadePaginas = quantidadePaginas;
	}

	public int getQuantidadeFigurinhas() {
		return quantidadeFigurinhas;
	}

	public void setQuantidadeFigurinhas(int quantidadeFigurinhas) {
		this.quantidadeFigurinhas = quantidadeFigurinhas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Figurinha> getFigurinha() {
		return figurinha;
	}

	public void setFigurinha(List<Figurinha> figurinha) {
		this.figurinha = figurinha;
	}

	@Override
	public String toString() {
		return "|----------AlbumFigurinhas----------| " + "\n"
				+ "Id = " + id + "\n" 
				+ "QuantidadePaginas = " + quantidadePaginas + "\n" 
				+ "QuantidadeFigurinhas = "+ quantidadeFigurinhas + "\n"
				+ "Nome = " + nome ;
	}
	
	
}
