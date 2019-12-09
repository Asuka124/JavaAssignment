package hz222bp_assign4.stack;

import java.util.Iterator;

/*Assignment 4; Exercise 3
 *Hailing Zhang(hz222bp) 
 *2017-12-25*/
public class StackIterator implements Iterator<Object> {
	private int max;
	private int nextElement = 0; // first element
	private Object[] elements;// last element

	public StackIterator(Object[] array, int size) {
		elements = array;
		max = size;
	}

	public boolean hasNext() {
		return nextElement < max;
	}

	public Object next() {
		return elements[nextElement++]; 
	}
}