package br.edu.computador;

import br.edu.usuario.Usuario;

public class Computador {
	protected Usuario usuario;
	protected int arquivos;
	protected boolean botaoPower;
	protected static int armazenmento = 10000;
	
	//--------------------------------------------------
	
	public Computador(){

	}
		
	public Computador(Usuario usuario, int arquivos, boolean botaoPower){
			this.usuario = usuario;
			this.arquivos = arquivos;
			this.botaoPower = botaoPower;
	}
		
		//--------------------------------------------------
	
	public Usuario getUsuario() {
		return this.usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public int getArquivos() {
		return this.arquivos;
	}
	
	//--------------------------------------------------
	
	public void ligar() {
		if(botaoPower)
			System.out.println("Já está ligado");
		else {
			botaoPower = true;
			System.out.println("Ligado");
		}		
	}
	
	void desligar() {
		if(botaoPower) {
			botaoPower = false;
			System.out.println("Desligado");
		}
		else 
			System.out.println("Já está desligado");
	}	

	public void criar(int quantia) {
		if(botaoPower)
			this.arquivos = this.arquivos + quantia;
		else 
			System.out.println("Ligue o coputador");		
	}
	
	public void enviar(int quantia, Computador destino) {
		if(botaoPower) {
			destino.criar(quantia);
		}
		else 		
			System.out.println("Ligue o coputador");
	}
	
	public void armazenar(int quantia) {
		if(botaoPower) {
			if(quantia > Computador.armazenmento) 
				System.out.println("Espaço insuficiente excrua arquivos\n");
			else 
				Computador.armazenmento -= quantia;
				this.arquivos += quantia;
		}
		else 		
			System.out.println("Ligue o coputador");
	}
	
	//--------------------------------------------------
	public void mostrarEstado() {
		usuario.mostarEstado();
		System.out.println("Numero de arquivos: " + this.arquivos);
		System.out.println("Computador ligado: " + botaoPower);
		System.out.println("\nArmazemnamento disponivel: " + Computador.armazenmento + "\n");
	}
	
	public void mostrarArquivos() {
		usuario.mostarArquivos();
		System.out.println("Numero de arquivos: " + arquivos + "\n");
	}
}
