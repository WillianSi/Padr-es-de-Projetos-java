package willian;

public class VideoPlayer {
	private String descricao;
	private int numeroVideo;
	private Amplificador amplificador;
	private String titulo;

	public VideoPlayer(String descricao, Amplificador amplificador) {
		this.descricao = descricao;
		this.amplificador = amplificador;
		this.numeroVideo = 0;
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
		numeroVideo = 0;
		System.out.println(descricao + " reproduzindo \"" + titulo + "\"");
	}
	
	public void reproduzir(int numeroVideo) {
		this.numeroVideo = numeroVideo;
		if(titulo == null) {
			System.out.println(descricao + " não é possivel reproduzir " + this.numeroVideo + " nenhuma mídia detectada");
		}
		else {
			System.out.println(descricao + " reproduzindo video " + numeroVideo);
		}
	}

	public void parar() {
		numeroVideo = 0;
		System.out.println(descricao + " parando \"" + titulo + "\"");
	}
	
	public void pausar() {
		System.out.println(descricao + " pausando \"" + titulo + "\"");
	}
	
	public void setDoisCanais() {
		System.out.println(descricao + " dividido em dois canais");
	}
	
	public void setSomSurround() {
		System.out.println(descricao + " som surround on(5 auto falantes, 1 subwoofer)");
	}
	
	public String toString() {
		return descricao;
	}
}
