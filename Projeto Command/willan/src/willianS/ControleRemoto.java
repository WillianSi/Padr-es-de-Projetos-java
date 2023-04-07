package willianS;

import willian.comandos.Comando;
import willian.comandos.ComandoNulo;

public class ControleRemoto {
	private Comando[] comandosLiga;
	private Comando[] comandosDesliga;
	private Comando desfazer;
	
	public ControleRemoto() {
		comandosLiga = new Comando[5];
		comandosDesliga = new Comando[5];
		
		Comando comandoNulo = new ComandoNulo();
		
		for (int i = 0; i < 5; i++) {
			comandosLiga[i] = comandoNulo;
			comandosDesliga[i] = comandoNulo;
		}
		
		desfazer = comandoNulo;
		
	}
	
	public void setComando(int posicao, Comando liga, Comando desliga) {
		comandosLiga[posicao] = liga;
		comandosDesliga[posicao] = desliga;
	}
	
	public void presionarBotaoLiga(int posicao) {
		comandosLiga[posicao].executar();
		desfazer = comandosLiga[posicao];
	}
	
	public void presionarBotaoDesliga(int posicao) {
		comandosDesliga[posicao].executar();
		desfazer = comandosDesliga[posicao];
	}
	
	public void presionarBotaoDesfazer() {
		desfazer.desfazer();
	}
	
	public void exibir() {
		System.out.println("Configuração Comtrole Remoto:");
		System.out.println("-----------------------------");
		for (int i = 0; i < 5; i++) {
			System.out.println("Posição[" + (i+1) + "]" + comandosLiga[i].getClass().getSimpleName() + "|" + comandosDesliga[i].getClass().getSimpleName());
		}
	}
	
}
