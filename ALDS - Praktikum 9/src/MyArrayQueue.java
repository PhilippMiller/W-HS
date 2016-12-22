import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

@SuppressWarnings("rawtypes")
public class MyArrayQueue implements Queue{
	
	Object[] array;
	
	/**
	 * Creates a new Object-Array with length as n
	 * @param n
	 */
	public MyArrayQueue(int n) {
		array = new Object[n];
	}
	
	// IMPORTANT
	
	/** 
	 * Removes a given object at it's first hit
	 * Return true if the object was be found an removed
	 * Return false if the object wasn't be found
	 */
	@Override
	public boolean remove(Object arg0) {
		for (int i = 0; i < this.size(); i++) {
			if (arg0 == array[i]) {
				array[i] = null;
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Add a given object at the first available position
	 * Return true if a empty (null) position was be found an insert the object into it
	 * Return false if no empty (null) position was be found
	 */
	@Override
	public boolean add(Object arg0) {
		for (int i = 0; i < this.size(); i++) {
			if (array[i] == null) {
				array[i] = arg0;
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Reutrn the array size (includes empty spaces)
	 */
	@Override
	public int size() {
		return array.length;
	}
	
	/**
	 * Print out every object of the array
	 */
	public void print() {
		for (int i = 0; i < this.size(); i++) {
			System.out.println("[" + (i + 1) + "] -> " + array[i]);
		}
		System.out.println("");
	}
	
	
	
	
	// UNIMPORTANT

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean addAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object element() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean offer(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object poll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object remove() {
		// TODO Auto-generated method stub
		return null;
	}

}
