package willian;

public class CinemaEmCasa {

	public static void main(String[] args) {
		Amplificador amplificador = new Amplificador("amplificador Yamara");
		ReceptorRadio radio = new ReceptorRadio("receiver AM/FM", amplificador);
		VideoPlayer video = new VideoPlayer("reprodutor de v�deo Mi Box XAOMI", amplificador);
		AudioPlayer audio = new AudioPlayer("reprodutor de �udio Romacci X50", amplificador);
		Projetor projetor = new Projetor("projetor Epson", video);
		Iluminacao iluminacao = new Iluminacao("Ilumina��o de cinema");
		Tela tela = new Tela("tela de proje��o");
		Pipoqueira pipoqueira = new Pipoqueira("pipoquera Philco");
		
		CinemaEmCasaFacade homeTheater = new CinemaEmCasaFacade(amplificador, radio, video, audio, projetor, iluminacao, tela, pipoqueira);
		
		homeTheater.reproduzirVideo("Coringa");
		System.out.println("-----------------------------------------------");
		homeTheater.encerrarVideo();
		
		iluminacao = new Iluminacao("ilumina��o discoteca");
		homeTheater = new CinemaEmCasaFacade(amplificador, radio, video, audio, projetor, iluminacao, tela, pipoqueira);
		
		System.out.println("-----------------------------------------------");
		homeTheater.reproduAudio("Dont't Start Now");
		System.out.println("-----------------------------------------------");
		homeTheater.encerrarAudio();
		
		System.out.println("-----------------------------------------------");
		homeTheater.sintonizarRadio("R�dio Esta��o Cultura");
		System.out.println("-----------------------------------------------");
		homeTheater.encerrarRadio();
	}

}
