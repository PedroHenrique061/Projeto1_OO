package ClassesProjeto;

import java.util.Arrays;

public class Formula1 extends AlbumFigurinhas {

	private int quantidadeDeCarros;
	private FigurinhaPiloto figurinhas[];
	
	
	public Formula1() {
		super();
		toString();
	}
	public int getQuantidadeDeCarros() {
		return quantidadeDeCarros;
	}
	public void setQuantidadeDeCarros(int quantidadeDeCarros) {
		this.quantidadeDeCarros = quantidadeDeCarros;
	}
	public FigurinhaPiloto[] getFigurinhas() {
		return figurinhas;
	}
	public void setFigurinhas(FigurinhaPiloto[] figurinhas) {
		this.figurinhas = figurinhas;
	}
	@Override
	public String toString() {
		return "|----------Formula1----------|" +
				"Id = " + getId() + "\n" +
				"QuantidadeDePaginas = " + getQuantidadeDePaginas() + "\n" +
				"QuantidadeDeFigurinhas = " + getQuantidadeDeFigurinhas() + "\n" +
				"QuantidadeDeCarros = " + "\n" + 
				"Figurinhas = " + Arrays.toString(figurinhas);
				
	}
	
}
