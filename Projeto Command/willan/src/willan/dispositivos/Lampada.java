package willan.dispositivos;

public class Lampada {
	private String local;
	private boolean acesa = false;
	
	public Lampada(String local) {
		this.local = local;
	}
	
	public void acender() {
		acesa = true;
		exibir();
	}
	
	public void apagar() {
		acesa = false;
		exibir();
	}
	
	public void exibir() {
		System.out.println("Lampada " + local + " " + (acesa?"acesa":"apagada"));
	}
}
