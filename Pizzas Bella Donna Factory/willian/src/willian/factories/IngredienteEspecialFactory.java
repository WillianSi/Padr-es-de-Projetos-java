package willian.factories;

import willian.Ingredientes.CatupiryOriginal;
import willian.Ingredientes.GorgonzolaSuico;
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
import willian.Ingredientes.ManjericaoFrances;
import willian.Ingredientes.MassaFina;
import willian.Ingredientes.MolhoMarinara;
import willian.Ingredientes.MozzarellaBufala;
import willian.Ingredientes.OreganoPeruano;
import willian.Ingredientes.ParmigianoReggiano;
import willian.Ingredientes.ProvoloneHolandes;
import willian.Ingredientes.TomateOrganico;

public class IngredienteEspecialFactory implements IngredienteFactory{

	@Override
	public IMassa criarMassa() {
		return new MassaFina();
	}

	@Override
	public IMolho criarMolho() {
		return new MolhoMarinara();
	}

	@Override
	public IMozzarella criarMozzarella() {
		return new MozzarellaBufala();
	}

	@Override
	public IProvolone criarProvolone() {
		return new ProvoloneHolandes();
	}

	@Override
	public IGorgonzola criarGorgonzola() {
		return new GorgonzolaSuico();
	}

	@Override
	public IParmesao criarParmesao() {
		return new ParmigianoReggiano();
	}

	@Override
	public ICatupiry criarCatupiry() {
		return new CatupiryOriginal();
	}

	@Override
	public ITomate criarTomate() {
		return new TomateOrganico();
	}

	@Override
	public IOregano criaOregano() {
		return new OreganoPeruano();
	}

	@Override
	public IManjericao criarManjericao() {
		return new ManjericaoFrances();
	}
	
}
