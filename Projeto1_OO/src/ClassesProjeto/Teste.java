package ClassesProjeto;

public class Teste {

	public static void main(String[] args) {
		
		
		Usuario usuario1 = new Usuario();
		usuario1.setNome("Pedro");
		usuario1.setCpf("000.000.000.01");
		usuario1.setTelefone("61999999999");
		usuario1.setAlbum(null);
		System.out.println(usuario1);
		System.out.println("");
		
		CopaDoMundo album1 = new CopaDoMundo();
		album1.setId(01);
		album1.setQuantidadeDePaginas(50);
		album1.setQuantidadeDeFigurinhas(400);
		album1.setQuantidadeDeSelecoes(20);
		album1.setFigurinhas(null);
		System.out.println(album1);
		System.out.println("");
		
		Formula1 album2 = new Formula1();
		album2.setId(02);
		album2.setQuantidadeDePaginas(30);
		album2.setQuantidadeDeFigurinhas(300);
		album2.setQuantidadeDeCarros(15);
		album2.setFigurinhas(null);
		System.out.println(album2);
		System.out.println("");
		
		FigurinhaJogador jogador1 = new FigurinhaJogador();
		jogador1.setId(10);
		jogador1.setNome("Neymar");
		jogador1.setPosicao("Atacante");
		jogador1.setSelecao("Brasil");
		jogador1.setLendaria(true);
		jogador1.setPreco(3.0);
		System.out.println(jogador1);
		System.out.println("");
		
		FigurinhaPiloto piloto1 = new FigurinhaPiloto();
		piloto1.setId(20);
		piloto1.setNome("Ayrton Senna");
		piloto1.setMarcaCarro("Ferrari");
		piloto1.setVelocidadeMaximaCarro(300);
		piloto1.setLendaria(false);
		piloto1.setPreco(2.50);
		System.out.println(piloto1);
		System.out.println("");
		
	}
}
