package willian;

import java.util.ArrayList;

public class PobrsMenuIterator implements IIterator{
	private ArrayList<MenuItem> itens;
	private int posicao = 0;

	public PobrsMenuIterator(ArrayList<MenuItem> itens) {
		this.itens = itens;
	}

	public Object next() {
		Object object = itens.get(posicao);
		posicao = posicao + 1;
		return object;
	}
		
	public boolean hasNext() {
		if (posicao >= itens.size()) {
			return false;
		} else {
			return true;
		}
	}
}
