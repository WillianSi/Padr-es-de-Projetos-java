package willian;

public class Tela {
	private String descricao;

	public Tela(String descricao) {
		this.descricao = descricao;
	}
	
	public void expandir() {
		System.out.println(descricao + " expandido");
	}
	
	public void retrair() {
		System.out.println(descricao + " retraido");
	}
	
	public String toString() {
		return descricao;
	}
}
