package willian;

public class Amplificador {
	private String descricao;
	private ReceptorRadio radio;
	private VideoPlayer video;
	private AudioPlayer audio;
	
	public Amplificador(String descricao) {
		this.descricao = descricao;
	}
	
	public void setOn() {
		System.out.println(descricao + " on");
	}
	
	public void setOff() {
		System.out.println(descricao + " off");
	}
	
	public void setSomStereo() {
		System.out.println(descricao + " modo Stereo on");
	}
	
	public void setSomSurround() {
		System.out.println(descricao + " som surround on(5 auto falantes, 1 subwoofer)");
	}
	
	public void setVolume(int volume) {
		System.out.println(descricao + " ajustando volume para " + volume);
	}

	public void setRadio(ReceptorRadio radio) {
		this.radio = radio;
		System.out.println(descricao + " se conectando com " + this.radio);
	}

	public void setVideo(VideoPlayer video) {
		this.video = video;
		System.out.println(descricao + " se conectando com " + this.video);
	}

	public void setAudio(AudioPlayer audio) {
		this.audio = audio;
		System.out.println(descricao + " se conectando com " + this.audio);
	}
	
	public String toString() {
		return descricao;
	}
}
