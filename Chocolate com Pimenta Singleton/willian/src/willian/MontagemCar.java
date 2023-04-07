package willian;

public class MontagemCar {

	public static void main(String[] args) {
		
		LinhaMontagemCar linhaMontagem = LinhaMontagemCar.getInstanciaUnica();
		LinhaMontagemCar linhaMontagem2 = LinhaMontagemCar.getInstanciaUnica();
		
		linhaMontagem.montarChassi();
		linhaMontagem2.montarChassi();
		linhaMontagem.montarMotor();
		linhaMontagem2.montarMotor();
		linhaMontagem.montarRodas();
		linhaMontagem2.montarRodas();
		linhaMontagem.montarPortas();
		linhaMontagem2.montarPortas();
		linhaMontagem.montarBancos();
		linhaMontagem2.montarBancos();

	}

}
