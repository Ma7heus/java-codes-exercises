package br.matheus.nerdflix;

public class Usuario {
	private String nome;
	private String userName;
	private String password;
	
	public Usuario(String nome, String userName,String password) {
		this.nome = nome;
		this.userName = userName;
		this.password = password;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
