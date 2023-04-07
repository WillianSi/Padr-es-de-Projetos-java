package willian;

public class Iluminacao {
	private String descricao;

	public Iluminacao(String descricao) {
		this.descricao = descricao;
	}
	
	public void setOn() {
		System.out.println(descricao + " on");
	}
	
	public void setOff() {
		System.out.println(descricao + " off");
	}
	
	public void setIntensidade(int nivel) {
		System.out.println(descricao + " ajustando a intensidade para " + nivel + "%");
	}

	public String toString() {
		return descricao;
	}
}
