package model;

public class Admin implements Usuario {
	//Atributos do usuario
	
	private String nome;
	private String login;
	private String senha;
	private String sessao;
	

	public Admin(String nome, String login, String senha, String sessao) {
		super();
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.sessao = sessao;
	}

	@Override
	public void logIn(String login, String senha) {
		
		

	}

	@Override
	public void logOut(String sessão) {
		// TODO Auto-generated method stub

	}

}
