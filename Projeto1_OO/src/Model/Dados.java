package Model;

public class Dados {

	private Usuario[] usuario = new Usuario[50];
	private int qtdUsuarios = 0;
	private AlbumFigurinhas[] albumFigurinhas = new AlbumFigurinhas[50];
	private int qtdAlbuns = 0;
	private FigurinhaJogador[] figurinhaJogador = new FigurinhaJogador[50];
	private int qtdFigurinhasJogadores = 0;
	private FigurinhaEstadio[] figurinhaEstadio = new FigurinhaEstadio[50];
	private int qtdFigurinhasEstadios = 0;
	
	public void adicionarDados(){
		
		for(int i = 0; i < 5; i++){
			
			usuario[i] = new Usuario("Pedro", "00000000001" +i, "61999999999");
			
			albumFigurinhas[i] = new AlbumFigurinhas("01"+i, 50, 300, "Copa do Mundo 2022", null);
			
			figurinhaJogador[i] = new FigurinhaJogador("Volante", "Brasil");
			figurinhaJogador[i].setId("10"+i);
			figurinhaJogador[i].setNome("Casemiro"+i);
			figurinhaJogador[i].setPreco(1.25);
			figurinhaJogador[i].setLendaria("Sim");
			
			figurinhaEstadio[i] = new FigurinhaEstadio("1948", 78.500);
			figurinhaEstadio[i].setId("20"+i);
			figurinhaEstadio[i].setNome("Maracanã"+i);
			figurinhaEstadio[i].setPreco(1.00);
			figurinhaEstadio[i].setLendaria("Não");
			
			qtdUsuarios = 3;
			qtdAlbuns = 3;
			qtdFigurinhasJogadores = 3;
			qtdFigurinhasEstadios = 3;
					
		}
	}
	
	public Usuario[] getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario[] usuario) {
		this.usuario = usuario;
	}
	
	public int getQtdUsuarios() {
		return qtdUsuarios;
	}
	
	public void setQtdUsuarios(int qtdUsuarios) {
		this.qtdUsuarios = qtdUsuarios;
	}
	
	
	public AlbumFigurinhas[] getAlbumFigurinhas() {
		return albumFigurinhas;
	}
	
	public void setAlbumFigurinhas(AlbumFigurinhas[] albumFigurinhas) {
		this.albumFigurinhas = albumFigurinhas;
	}
	
	public int getQtdAlbuns() {
		return qtdAlbuns;
	}
	
	public void setQtdAlbuns(int qtdAlbuns) {
		this.qtdAlbuns = qtdAlbuns;
	}
	
	public FigurinhaJogador[] getFigurinhaJogador() {
		return figurinhaJogador;
	}
	
	public void setFigurinhaJogador(FigurinhaJogador[] figurinhaJogador) {
		this.figurinhaJogador = figurinhaJogador;
	}
	
	public int getQtdFigurinhasJogadores() {
		return qtdFigurinhasJogadores;
	}
	
	public void setQtdFigurinhasJogadores(int qtdFigurinhasJogadores) {
		this.qtdFigurinhasJogadores = qtdFigurinhasJogadores;
	}
	
	public FigurinhaEstadio[] getFigurinhaEstadio() {
		return figurinhaEstadio;
	}
	
	public void setFigurinhaEstadio(FigurinhaEstadio[] figurinhaEstadio) {
		this.figurinhaEstadio = figurinhaEstadio;
	}
	
	public int getQtdFigurinhasEstadios() {
		return qtdFigurinhasEstadios;
	}
	
	public void setQtdFigurinhasEstadios(int qtdFigurinhasEstadios) {
		this.qtdFigurinhasEstadios = qtdFigurinhasEstadios;
	}
	
	public void cadastrarUsuario(Usuario usuario, int pos){
		this.usuario[pos] = usuario;
		if(pos == qtdUsuarios) qtdUsuarios++;
	}
	
	public void cadastrarAlbumFigurinha(AlbumFigurinhas albumFigurinhas, int pos){
		this.albumFigurinhas[pos] = albumFigurinhas;
		if(pos == qtdAlbuns) qtdAlbuns++;
	}
	
	public void cadastrarFigurinhaJogador(FigurinhaJogador figurinhaJogador, int pos) {
		this.figurinhaJogador[pos] = figurinhaJogador;
		if(pos == qtdFigurinhasJogadores) qtdFigurinhasJogadores++;
	}
	
	public void cadastrarFigurinhaEstadio(FigurinhaEstadio figurinhaEstadio, int pos) {
		this.figurinhaEstadio[pos] = figurinhaEstadio;
		if(pos == qtdFigurinhasEstadios) qtdFigurinhasEstadios++;
	}

}