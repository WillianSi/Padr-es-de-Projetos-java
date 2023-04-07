package willian;

public class AudioPlayer {
	private String descricao;
	private int numeroAudio;
	private Amplificador amplificador;
	private String titulo;

	public AudioPlayer(String descricao, Amplificador amplificador) {
		this.descricao = descricao;
		this.amplificador = amplificador;
		this.numeroAudio = 0;
	}
	
	public void setOn() {
		System.out.println(descricao + " on");
	}
	
	public void setOff() {
		System.out.println(descricao + " off");
	}
	
	public void desconectar() {
		titulo = null;
		System.out.println(descricao + " se desconectando do " + amplificador);
	}
	
	public void reproduzir(String titulo) {
		this.titulo = titulo;
		numeroAudio = 0;
		System.out.println(descricao + " tocando \"" + titulo + "\"");
	}
	
	public void reproduzir(int numeroAudio) {
		this.numeroAudio = numeroAudio;
		if(titulo == null) {
			System.out.println(descricao + " não é possivel reproduzir" + this.numeroAudio + " nenhuma mídia detectada");
		}
		else {
			System.out.println(descricao + " tocando música" + numeroAudio);
		}
	}

	public void parar() {
		numeroAudio = 0;
		System.out.println(descricao + " parando");
	}
	
	public void pausar() {
		System.out.println(descricao + " pausando \"" + titulo + "\"");
	}
	
	public String toString() {
		return descricao;
	}
}
