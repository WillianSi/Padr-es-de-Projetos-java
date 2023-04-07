package willan.dispositivos;

public class TV {
	private String local;
	private boolean ligada;
	
	public TV(String local) {
		this.local = local;
	}
	
	public void ligada() {
		ligada = true;
		exibir();
	}
	
	public void desligada() {
		ligada = false;
		exibir();
	}
	
	public void exibir() {
		System.out.println("TV " + local + " " + (ligada?"ligada":"desligada"));
	}
}
