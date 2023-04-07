package willian;

public class Pescador implements IAssinante{
	private String nome;
	private float temperatura;
	private float vento;
	private boolean chuva;
	
	public Pescador(String nome) {
		this.nome = nome;
	}
	
	public void atualizar(DadoMeteoroligico dado) {
		this.temperatura = dado.getTemperatura();
		this.vento = dado.getVento();
		this.chuva = dado.isChuva();
	}
	
	public void exibir() {
		System.out.println("Pescador: " + nome);
		System.out.println("Temperatura: " + temperatura + "°C");
		System.out.println("Vento: " + vento + "Km/h");
		System.out.println("Chuva: " + (chuva ? "sim" : "não"));
		System.out.println("-----------------------------------------");
	}
}
