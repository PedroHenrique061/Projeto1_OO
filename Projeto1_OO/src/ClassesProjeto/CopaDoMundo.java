package ClassesProjeto;

import java.util.Arrays;

public class CopaDoMundo extends AlbumFigurinhas{

	private int quantidadeDeSelecoes;
	private FigurinhaJogador figurinhas[];
	
	public CopaDoMundo() {
		super();
		toString();
	}
	public int getQuantidadeDeSelecoes() {
		return quantidadeDeSelecoes;
	}
	public void setQuantidadeDeSelecoes(int quantidadeDeSelecoes) {
		this.quantidadeDeSelecoes = quantidadeDeSelecoes;
	}
	public FigurinhaJogador[] getFigurinhas() {
		return figurinhas;
	}
	public void setFigurinhas(FigurinhaJogador[] figurinhas) {
		this.figurinhas = figurinhas;
	}
	@Override
	public String toString() {
		return "|----------CopaDoMundo----------|" + "\n" +
				"Id = " + getId() + "\n" +
				"QuantidadeDePaginas = " + getQuantidadeDePaginas() + "\n" +
				"QuantidadeDeFigurinhas = " + getQuantidadeDeFigurinhas() + "\n" +
				"QuantidadeDeSelecoes = " + quantidadeDeSelecoes + "\n" + 
				"Figurinhas = " + Arrays.toString(figurinhas);
				
	}

}
