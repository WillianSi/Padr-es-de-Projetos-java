package willian;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChaComGancho extends BebidaCafeinadaComGancho{
	
	public boolean gancho() {
		
		String resposta = getResposta();
		
		if (resposta.toLowerCase().startsWith("s")) {
			return true;
		} else {
			return false;
		}
	}
	
	private String getResposta() {
		String resposta = null;
		
		System.out.println("Gostaria de limão em seu cha (s/n)? ");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			resposta = in.readLine();
		} catch (IOException ioe) {
			System.err.println("IO erro tentando ler resposta");
		}
		
		if (resposta == null) {
			return "não";
		}
		return resposta;
	}

	@Override
	void infundir() {
		System.out.println("Infundindo chá");
	}

	@Override
	void adicionarToppings() {
		System.out.println("Adicionando limão");
	}

}
