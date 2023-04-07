package willian;

public class Trasportador implements IAssinante{
	private String nome;
	private float temperatura;
	private float umidade;
	private float vento;
	private boolean chuva;
	
	public Trasportador(String nome) {
		this.nome = nome;
	}
	
	public void atualizar(DadoMeteoroligico dado) {
		this.temperatura = dado.getTemperatura();
		this.umidade = dado.getUmidade();
		this.vento = dado.getVento();
		this.chuva = dado.isChuva();
	}
	
	public void exibir() {
		System.out.println("Trasportador: " + nome);
		System.out.println("Temperatura: " + temperatura + "°C");
		System.out.println("Vento: " + vento + "Km/h");
		System.out.println("Umidade: " + umidade + "%");
		System.out.println("Chuva: " + (chuva ? "sim" : "não"));
		System.out.println("-----------------------------------------");
	}
}
