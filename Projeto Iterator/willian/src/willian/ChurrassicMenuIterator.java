package willian;

public class ChurrassicMenuIterator implements IIterator{
	private MenuItem[] itens;
	private int posicao = 0;
	
	public ChurrassicMenuIterator(MenuItem[] itens) {
		this.itens = itens;
	}

	public Object next() {
		MenuItem menuItem = itens[posicao];
		posicao = posicao + 1;
		return menuItem;
	}
		
	public boolean hasNext() {
		if (posicao >= itens.length || itens[posicao] == null) {
			return false;
		} else {
			return true;
		}
	}
}
