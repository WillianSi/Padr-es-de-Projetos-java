package willian;

public class TomadaDoisPinos implements Itomada{
	
	@Override
	public void conectar() {
		System.out.println("Conectado a uma tomada de dois pinos");
	}

	@Override
	public void energia() {
		System.out.println("Passando energia | não possui pino terra");
	}
	
	@Override
	public void comsumo() {
		double comsumo = 3.70 * 24; 
		System.out.println("Comsumo: " + deci.format(comsumo) + "Kw/h");
	}
	
	@Override
	public void exibir() {
		conectar();
		energia();
		comsumo();
	}
}
