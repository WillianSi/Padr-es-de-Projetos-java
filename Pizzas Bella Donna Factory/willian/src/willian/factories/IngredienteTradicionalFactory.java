package willian.factories;

import willian.Ingredientes.Catupiry;
import willian.Ingredientes.Gorgonzola;
import willian.Ingredientes.ICatupiry;
import willian.Ingredientes.IGorgonzola;
import willian.Ingredientes.IManjericao;
import willian.Ingredientes.IMassa;
import willian.Ingredientes.IMolho;
import willian.Ingredientes.IMozzarella;
import willian.Ingredientes.IOregano;
import willian.Ingredientes.IParmesao;
import willian.Ingredientes.IProvolone;
import willian.Ingredientes.ITomate;
import willian.Ingredientes.Manjericao;
import willian.Ingredientes.MassaTradicional;
import willian.Ingredientes.MolhoTomate;
import willian.Ingredientes.Mozzarella;
import willian.Ingredientes.Oregano;
import willian.Ingredientes.Parmesao;
import willian.Ingredientes.Provolone;
import willian.Ingredientes.Tomate;

public class IngredienteTradicionalFactory implements IngredienteFactory{

	@Override
	public IMassa criarMassa() {
		return new MassaTradicional();
	}

	@Override
	public IMolho criarMolho() {
		return new MolhoTomate();
	}

	@Override
	public IMozzarella criarMozzarella() {
		return new Mozzarella();
	}

	@Override
	public IProvolone criarProvolone() {
		return new Provolone();
	}

	@Override
	public IGorgonzola criarGorgonzola() {
		return new Gorgonzola();
	}

	@Override
	public IParmesao criarParmesao() {
		return new Parmesao();
	}

	@Override
	public ICatupiry criarCatupiry() {
		return new Catupiry();
	}

	@Override
	public ITomate criarTomate() {
		return new Tomate();
	}

	@Override
	public IOregano criaOregano() {
		return new Oregano();
	}

	@Override
	public IManjericao criarManjericao() {
		return new Manjericao();
	}
	
}
