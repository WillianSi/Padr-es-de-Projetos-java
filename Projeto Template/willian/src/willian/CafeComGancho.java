package willian;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CafeComGancho extends BebidaCafeinadaComGancho{
	
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
		
		System.out.println("Gostaria de leite e a��car em seu caf� (s/n)? ");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			resposta = in.readLine();
		} catch (IOException ioe) {
			System.err.println("IO erro tentando ler resposta");
		}
		
		if (resposta == null) {
			return "n�o";
		}
		return resposta;
	}

	@Override
	void infundir() {
		System.out.println("Coando caf�");
	}

	@Override
	void adicionarToppings() {
		System.out.println("Adicinando a��car e leite");
	}
}
