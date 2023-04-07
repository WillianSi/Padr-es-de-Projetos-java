package willianS;

import willan.dispositivos.Lampada;
import willan.dispositivos.Portao;
import willan.dispositivos.TV;
import willan.dispositivos.Ventilador;
import willian.comandos.AbrePortao;
import willian.comandos.AcendeLampada;
import willian.comandos.ApagaLampada;
import willian.comandos.Comando;
import willian.comandos.ComandoGeral;
import willian.comandos.DesligaTV;
import willian.comandos.DesligaVentilador;
import willian.comandos.FechaPortao;
import willian.comandos.LigaTV;
import willian.comandos.LigaVentilador;

public class Click {

	public static void main(String[] args) {
		ControleRemoto controleRemoto = new ControleRemoto();
		
		Lampada lampadaCozinha = new Lampada("da cozinha");
		Ventilador ventiladorSala = new Ventilador("da sala");
		Portao portao = new Portao("da garagem");
		TV tvSala = new TV("da sala");
		
		AcendeLampada acendeLampadaCozinha = new AcendeLampada(lampadaCozinha);
		ApagaLampada apagaLampadaCozinha = new ApagaLampada(lampadaCozinha);
		LigaVentilador ligaVentilador = new LigaVentilador(ventiladorSala);
		DesligaVentilador desligaVentilador = new DesligaVentilador(ventiladorSala);
		AbrePortao abrePortao = new AbrePortao(portao);
		FechaPortao fechaPortao = new FechaPortao(portao);
		LigaTV ligaTV = new LigaTV(tvSala);
		DesligaTV desligaTV = new DesligaTV(tvSala);
		
		Comando[] liga = {acendeLampadaCozinha, ligaVentilador, abrePortao,ligaTV};
		Comando[] desliga = {apagaLampadaCozinha, desligaVentilador, fechaPortao,desligaTV};
		
		ComandoGeral ligaGeral = new ComandoGeral(liga);
		ComandoGeral desligaGeral = new ComandoGeral(desliga);
		
		controleRemoto.setComando(0, acendeLampadaCozinha, apagaLampadaCozinha);
		controleRemoto.setComando(1, ligaVentilador, desligaVentilador);
		controleRemoto.setComando(2, abrePortao, fechaPortao);
		controleRemoto.setComando(3, ligaTV, desligaTV);
		controleRemoto.setComando(4, ligaGeral, desligaGeral);
		
		controleRemoto.exibir();
		
		System.out.println("-----------------------------------");
		controleRemoto.presionarBotaoLiga(4);
		System.out.println("-----------------------------------");
		controleRemoto.presionarBotaoDesliga(4);
		System.out.println("-----------------------------------");
		controleRemoto.presionarBotaoDesfazer();
	}

}
