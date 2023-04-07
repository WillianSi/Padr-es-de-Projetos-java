package willian;

import java.util.Iterator;

public abstract class ComponenteMenu {

	public void add(ComponenteMenu menuComponent) {
		throw new UnsupportedOperationException();
	}
	
	public void remove(ComponenteMenu menuComponent) {
		throw new UnsupportedOperationException();
	}
	
	public ComponenteMenu getChild(int i) {
		throw new UnsupportedOperationException();
	}
	
	public String getNome() {
		throw new UnsupportedOperationException();
	}

	public String getDescricao() {
		throw new UnsupportedOperationException();
	}
	
	public double getPreco() {
		throw new UnsupportedOperationException();
	}
	
	public boolean isVegetariano() {
		throw new UnsupportedOperationException();
	}
	
	public abstract Iterator createIterator();
	
	public void print() {
		throw new UnsupportedOperationException();
	}
}
