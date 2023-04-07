package br.edu.computador;

import br.edu.usuario.Usuario;

public class Backup extends Computador{
	
	public Backup(){

	}
	
	public Backup(Usuario usuario, int arquivos, boolean botaoPower) {
		super(usuario, arquivos, botaoPower);
	}
	
	//--------------------------------------------------
	
	public void criar(int quantia) {	
		this.arquivos = this.arquivos * 2;
		if(botaoPower) {	
			this.arquivos = this.arquivos + quantia;
		}
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
}
