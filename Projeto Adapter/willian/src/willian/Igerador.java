package willian;

import java.text.DecimalFormat;

public interface Igerador {
	DecimalFormat deci = new DecimalFormat("0.00");
	
	public void conectar();
	public void gerarEnergia();
	public void comsumo();
	public void exibir();
}
