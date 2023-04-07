/**
 * 
 */
package br.edu.principal;

import br.edu.cargo.AnalistaBD;
import br.edu.cargo.AuxiliarDeVendas;
import br.edu.cargo.GerenteDeVendas;
import br.edu.computador.Backup;
import br.edu.computador.DadosLocal;
import br.edu.usuario.Usuario;

/**
 * @author Willian Silvestre
 *
 */
public class Comandos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Usuario usuario1 = new Usuario();
		Usuario usuario2 = new Usuario();
		Usuario usuario3 = new Usuario();
		
		Backup maquina1 = new Backup();
		DadosLocal maquina2 = new DadosLocal();
		DadosLocal maquina3 = new DadosLocal();
		
		//--------------------------------------------------
		
		usuario1.setNome("Marcos");
		usuario1.setCargo("AnalistaBD");
		usuario1.setSexo('M');
		usuario1.setSenha("123");
		
		usuario2.setNome("Ana");
		usuario2.setCargo("GerenteDeVendas");
		usuario2.setSexo('F');
		usuario2.setSenha("w2f");
		
		usuario3.setNome("Daniel");
		usuario3.setCargo("AuxiliarDeVendas");
		usuario3.setSexo('M');
		usuario3.setSenha("7y9");
		
		maquina1.setUsuario(usuario1);
		maquina1.ligar();
		maquina1.criar(10);
		
		maquina2.setUsuario(usuario2);
		maquina2.ligar();
		maquina2.criar(10);
		
		maquina3.setUsuario(usuario3);
		maquina3.ligar();
		maquina3.criar(15);
		
		//--------------------------------------------------
		
		System.out.println("------------Permições para cada cargo----------------\n");
		
		AnalistaBD analista = new AnalistaBD();
		GerenteDeVendas gerente = new GerenteDeVendas();
		AuxiliarDeVendas auxiliar = new AuxiliarDeVendas();
		
		System.out.println("Analista de banco de dados: ");
		analista.permicao();
		
		System.out.println("Gerente de vendas: ");
		gerente.permicao();
		
		System.out.println("Auxiliar de vendas: ");
		auxiliar.permicao();
		
		//--------------------------------------------------
		
		if(usuario1.getCargo() == "AnalistaBD") {
		
			System.out.println("------------ ARQUIVOS BACKUP----------------");
			
			System.out.println("Analista de banco de dados: ");
			analista.permicao();
			
			System.out.println("ESTADO INICIAL:\n");
			maquina1.mostrarArquivos();
			maquina3.mostrarArquivos();
			
			maquina1.criar(5);
			maquina1.enviar(4, maquina3);
			
			System.out.println("ESTADO FINAL:\n");
			maquina1.mostrarArquivos();
			maquina3.mostrarArquivos();
		}
		
		else {
			System.out.println("------------ ARQUIVOS BACKUP INACESSIVEIS----------------");
			
			System.out.println("Sua permição deve ser de:\n\nGerente de vendas:");
			
			gerente.permicao();
			System.out.println("Auxiliar de vendas: ");
			auxiliar.permicao();
		}
		
		//--------------------------------------------------
		
		if(usuario2.getCargo() == "GerenteDeVendas" || usuario1.getCargo() == "AnalistaBD") {
			
		System.out.println("------------ ARQUIVOS LOCAIS----------------");
		
			System.out.println("Analista de banco de dados:");
			analista.permicao();
		
			System.out.println("Gerente de vendas:");
			gerente.permicao();
			
			System.out.println("ESTADO INICIAL:\n");
			maquina2.mostrarArquivos();
			maquina3.mostrarArquivos();
			
			maquina2.apagar(5);
			maquina2.mover(5, maquina3);
			maquina3.enviar(10, maquina1);
			
			System.out.println("ESTADO FINAL:\n");
			maquina2.mostrarArquivos();
			maquina3.mostrarArquivos();
			
			System.out.println("Apagar:\n");
			maquina3.mostrarArquivos();
			maquina3.apagar(5);
			maquina3.mostrarArquivos();
			
//			maquina1.apagar(5);
//			maquina1.mostrarArquivos();
		}
		
		else {
			System.out.println("------------ ARQUIVOS LOCAIS INACESSIVEIS----------------");
			
			System.out.println("Sua permição deve ser de:\n\nAuxiliar de vendas:");
			auxiliar.permicao();
		}

		//--------------------------------------------------
		
		System.out.println("------------ESTADO DOS COMPUTADORES----------------\n");
		
		maquina1.mostrarEstado();
		maquina2.mostrarEstado();
		maquina3.mostrarEstado();
		
		System.out.println("*************************************");
		
		maquina1.armazenar(6000);
		maquina2.armazenar(3000);
		maquina3.armazenar(100);
		
		maquina1.mostrarEstado();
		maquina2.mostrarEstado();
		maquina3.mostrarEstado();
	}
}
