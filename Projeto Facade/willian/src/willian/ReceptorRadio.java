package willian;

public class ReceptorRadio {
	private String descricao;
	private Amplificador amplificador;
	private String emisora;

	public ReceptorRadio(String descricao, Amplificador amplificador) {
		this.descricao = descricao;
		this.amplificador = amplificador;
	}
	
	public void setOn() {
		System.out.println(descricao + " on");
	}
	
	public void setOff() {
		System.out.println(descricao + " off");
	}
	
	public void setSintonia(String emisora) {
		this.emisora = emisora;
		System.out.println(descricao + " sintonizando a rádio" + this.emisora);
	}

	public void setAM() {
		System.out.println(descricao + " ajustando para modo AM");
	}
	
	public void setFM() {
		System.out.println(descricao + " ajustando para modo FM");
	}
	
	public String toString() {
		return descricao;
	}
}
