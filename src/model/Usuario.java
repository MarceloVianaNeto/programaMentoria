package model;

public interface Usuario {
	public String nome = new String();
	public String login = new String();
	public String Senha = new String();
	public String sessao = "Out";
	
	
	public abstract void logIn(String login, String senha);
	public abstract void logOut(String sessão);
	

}


