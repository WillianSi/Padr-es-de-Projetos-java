package willian;

public class Distribuidor implements IAssinante{
	private String nome;
	private float temperatura;
	private float umidade;
	
	public Distribuidor(String nome) {
		this.nome = nome;
	}
	
	public void atualizar(DadoMeteoroligico dado) {
		this.temperatura = dado.getTemperatura();
		this.umidade = dado.getUmidade();
	}
	
	public void exibir() {
		System.out.println("Distribuidor: " + nome);
		System.out.println("Temperatura: " + temperatura + "°C");
		System.out.println("Umidade: " + umidade + "%");
		System.out.println("-----------------------------------------");
	}
}
