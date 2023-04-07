package br.edu.computador;

import br.edu.usuario.Usuario;

public class DadosLocal extends Computador implements Delete{
	
	public DadosLocal(){

	}
	
	public DadosLocal(Usuario usuario, int arquivos, boolean botaoPower) {
		super(usuario, arquivos, botaoPower);
	}
	
	//--------------------------------------------------------------------
	
	public void criar(int quantia) {
		if(botaoPower)
			this.arquivos = this.arquivos + quantia;
		else 
			System.out.println("Ligue o coputador");		
	}
	
	public void mover(int quantia, Computador destino) {
		if(botaoPower) {
			this.apagar(quantia);
			destino.criar(quantia);
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
	
	public void apagar(int quantia) {
		if(botaoPower) {
			if(quantia > this.arquivos) 
				System.out.println("Numero de arquivos insuficiente");
			else 
				this.arquivos = this.arquivos - quantia;
		}
		else 		
			System.out.println("Ligue o coputador");
	}
}
