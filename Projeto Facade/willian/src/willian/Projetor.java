package willian;

public class Projetor {
	private String descricao;
	private VideoPlayer video;

	public Projetor(String descricao, VideoPlayer video) {
		this.descricao = descricao;
		this.video = video;
	}
	
	public void setOn() {
		System.out.println(descricao + " on");
	}
	
	public void setOff() {
		System.out.println(descricao + " off");
	}
	
	public void setTelaPanoramica() {
		System.out.println(descricao + " em modo panor�mico(16x9 aspect ratio)");
	}
	
	public void setTelaPadrao() {
		System.out.println(descricao + " em modo padr�o(4x3 aspect ratio)");
	}

	public String toString() {
		return descricao;
	}
}
