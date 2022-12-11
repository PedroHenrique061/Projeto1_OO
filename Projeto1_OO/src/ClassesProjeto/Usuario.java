package ClassesProjeto;

import java.util.Arrays;

public class Usuario {

	private String nome;
	private String cpf;
	private String telefone;
	private AlbumFigurinhas album[];
	
	public Usuario() {
		super();
		toString();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public AlbumFigurinhas[] getAlbum() {
		return album;
	}
	public void setAlbum(AlbumFigurinhas[] album) {
		this.album = album;
	}
	@Override
	public String toString() {
		return "|----------Usuario----------|" + "\n" + 
			   "Nome = " + nome + "\n" +
	           "Cpf = " + cpf + "\n" +
			   "Telefone = " + telefone + "\n" +
			   "Album = " + Arrays.toString(album);
	
	}	
}
