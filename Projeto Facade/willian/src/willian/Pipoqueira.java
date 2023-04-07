package willian;

public class Pipoqueira {
	private String descricao;

	public Pipoqueira(String descricao) {
		this.descricao = descricao;
	}
	
	public void setOn() {
		System.out.println(descricao + " on");
	}
	
	public void setOff() {
		System.out.println(descricao + " off");
	}
	
	public void preparar() {
		System.out.println(descricao + " estourando pipoca");
	}

	public String toString() {
		return descricao;
	}
}
