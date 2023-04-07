package willan.dispositivos;

public class Ventilador {
	private String local;
	private boolean ligado = false;
	
	public Ventilador(String local) {
		this.local = local;
	}
	
	public void ligado() {
		ligado = true;
		exibir();
	}
	
	public void desligado() {
		ligado = false;
		exibir();
	}
	
	public void exibir() {
		System.out.println("Ventilador " + local + " " + (ligado?"ligado":"desligado"));
	}
}
