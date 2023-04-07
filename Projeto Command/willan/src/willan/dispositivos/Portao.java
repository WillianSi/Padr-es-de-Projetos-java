package willan.dispositivos;

public class Portao {
	private String local;
	private boolean aberto = false;
	
	public Portao(String local) {
		this.local = local;
	}
	
	public void abrir() {
		aberto = true;
		exibir();
	}
	
	public void fechar() {
		aberto = false;
		exibir();
	}
	
	public void exibir() {
		System.out.println("Portão " + local + " " + (aberto?"aberto":"fechado"));
	}
}
