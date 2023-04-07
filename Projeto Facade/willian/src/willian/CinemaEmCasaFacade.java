package willian;

public class CinemaEmCasaFacade {
	private Amplificador amplificador;
	private ReceptorRadio radio;
	private VideoPlayer video;
	private AudioPlayer audio;
	private Projetor projetor;
	private Iluminacao iluminacao;
	private Tela tela;
	private Pipoqueira pipoqueira;
	
	public CinemaEmCasaFacade(Amplificador amplificador, ReceptorRadio radio, VideoPlayer video, AudioPlayer audio,Projetor projetor, Iluminacao iluminacao, Tela tela, Pipoqueira pipoqueira) {
		
		this.amplificador = amplificador;
		this.radio = radio;
		this.video = video;
		this.audio = audio;
		this.projetor = projetor;
		this.iluminacao = iluminacao;
		this.tela = tela;
		this.pipoqueira = pipoqueira;
	}
	
	public void reproduzirVideo(String titulo) {
		System.out.println("Iniciando o sistema de cinema ...");
		pipoqueira.setOn();
		pipoqueira.preparar();
		iluminacao.setIntensidade(10);
		tela.expandir();
		projetor.setOn();
		projetor.setTelaPanoramica();
		amplificador.setOn();
		amplificador.setVideo(video);
		amplificador.setSomSurround();
		amplificador.setVolume(5);
		video.setOn();
		video.reproduzir(titulo);
	}
	
	public void encerrarVideo() {
		System.out.println("Desligando o sistema de cinema ...");
		pipoqueira.setOff();
		iluminacao.setOff();
		tela.retrair();
		projetor.setOff();
		amplificador.setOff();
		video.parar();
		video.desconectar();
		video.setOff();
	}
	
	public void reproduAudio(String titulo) {
		System.out.println("Iniciando o sistema disco ...");
		iluminacao.setOn();
		amplificador.setOn();
		amplificador.setVolume(40);
		amplificador.setAudio(audio);
		amplificador.setSomStereo();
		audio.setOn();
		audio.reproduzir(titulo);
	}

	public void encerrarAudio() {
		System.out.println("Desligando o sistema disco ...");
		iluminacao.setOff();
		amplificador.setOff();
		audio.parar();
		audio.desconectar();
		audio.setOff();
	}
	
	public void sintonizarRadio(String emissora) {
		System.out.println("Iniciando o sistema de rádio ...");
		radio.setOn();
		radio.setSintonia(emissora);
		amplificador.setOn();
		amplificador.setVolume(10);
		amplificador.setRadio(radio);
	}
	
	public void encerrarRadio() {
		System.out.println("Desligando o sistema de rádio ...");
		radio.setOff();
		amplificador.setOff();
	}
}
