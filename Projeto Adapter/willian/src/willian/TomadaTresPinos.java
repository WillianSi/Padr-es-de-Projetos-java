package willian;

public class TomadaTresPinos implements Itomada{

	@Override
	public void conectar() {
		System.out.println("Conectado a uma tomada de três pinos");	
	}
	
	@Override
	public void energia() {
		System.out.println("Passando energia | pino terra isolado");	
	}

	@Override
	public void comsumo() {
		double comsumo = 2.60 * 24; 
		System.out.println("Comsumo: " + deci.format(comsumo) + "Kw/h");	
	}
	
	@Override
	public void exibir() {
		conectar();
		energia();
		comsumo();
	}
}
