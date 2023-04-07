package willian;

import java.util.ArrayList;
import java.util.List;

public class DadoMeteoroligico {
	private List<IAssinante> assinantes = new ArrayList<>();
	private float temperatura;
	private float vento;
	private float umidade;
	private boolean chuva;
	
	public float getTemperatura() {
		return temperatura;
	}
	public float getVento() {
		return vento;
	}
	public float getUmidade() {
		return umidade;
	}
	public boolean isChuva() {
		return chuva;
	}
	
	public void inscrever(IAssinante assinante){
		assinantes.add(assinante);
	}
	
	public void desinscrever(IAssinante assinante){
		assinantes.remove(assinante);
	}
	
	public void atualizar(float temperatura,float vento, float umidade, boolean chuva){
		this.temperatura = temperatura;
		this.vento = vento;
		this.umidade = umidade;
		this.chuva = chuva;
		
		for (IAssinante assinante : assinantes) {
			assinante.atualizar(this);
		}
	}
}
