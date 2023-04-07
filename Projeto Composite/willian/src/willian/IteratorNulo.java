package willian;

import java.util.Iterator;

public class IteratorNulo implements Iterator{

	public Object next() {
		return null;
	}
	
	public boolean hasNext() {
		return false;
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}
}
