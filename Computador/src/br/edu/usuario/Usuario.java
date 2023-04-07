package br.edu.usuario;

public class Usuario {
	
	protected String nome;
	protected String cargo;
	protected char sexo;
	protected String senha;
	
	//--------------------------------------------------
	
	public Usuario(){

	}
	
	public Usuario(String nome, String cago, char sexo, String senha){
		this.nome = nome;
		this.cargo = cago;
		this.sexo = sexo;
		this.senha = senha;
	}
	
	//--------------------------------------------------
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return this.cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public char getSexo() {
		return this.sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public String getSenha() {
		return this.senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	//--------------------------------------------------
	public void mostarEstado() {
		System.out.println("Nome do usuario: " + nome);
		System.out.println("Cargo do usuario: " + cargo);
		System.out.println("Sexo do usuario: " + sexo);
		System.out.println("Senha do usuario: " + senha);
	}
	
	public void mostarArquivos() {
		System.out.println("Nome do usuario: " + nome);
	}
}
