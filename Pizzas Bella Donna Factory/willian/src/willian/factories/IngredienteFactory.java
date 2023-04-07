package willian.factories;

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

public interface IngredienteFactory {
	public IMassa criarMassa();
	public IMolho criarMolho();
	public IMozzarella criarMozzarella();
	public IProvolone criarProvolone();
	public IGorgonzola criarGorgonzola();
	public IParmesao criarParmesao();
	public ICatupiry criarCatupiry();
	public ITomate criarTomate();
	public IOregano criaOregano();
	public IManjericao criarManjericao();
}
