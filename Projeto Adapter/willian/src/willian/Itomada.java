package willian;

import java.text.DecimalFormat;

public interface Itomada {
	DecimalFormat deci = new DecimalFormat("0.00");
	
	public void conectar();
	public void energia();
	public void comsumo();
	public void exibir();
}
