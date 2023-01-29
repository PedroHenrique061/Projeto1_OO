package Model;

/**
Cria a classe de usuario
* @author Pedro Henrique Fernandino da Silva
* @version 1.0 
*/

import java.util.*;

public class Usuario{

	private String nome;
	private String cpf;
	private String telefone;
	private ArrayList<AlbumFigurinhas> album;
	

	public Usuario(String nome, String cpf, 
			String telefone, ArrayList<AlbumFigurinhas> album) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.album = album;
	}

	//construtor da classe
	public Usuario(String nome, String cpf, String telefone) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
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
	
	public ArrayList<AlbumFigurinhas> getAlbum() {
		return album;
	}

	public void setAlbum(ArrayList<AlbumFigurinhas> album) {
		this.album = album;
	}



	@Override
	public String toString() {
		return "|----------Usuario----------|" + "\n" + 
			   "Nome = " + nome + "\n" +
	           "Cpf = " + cpf + "\n" +
			   "Telefone = " + telefone ;
	
	}

}
