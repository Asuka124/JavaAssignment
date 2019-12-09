package hz222bp_assign4.stack;

import java.util.Iterator;
import java.lang.reflect.Array;
import java.util.*;
/*Assignment 4; Exercise 3
 *Hailing Zhang(hz222bp) 
 *2017-12-25*/
public class StackSteps implements Stack {
	private Object[] array = { 6, 0, -2, 10, 3.3, 6 };// Create an array as an example
	private int size = array.length;
	
	public int size() {
		return size;
	}

	public boolean isEmpty() {
		if (size == 0) {
			return true;
		} else {
			return false;
		}
	}

	public Object peek() {
		if (size == 0) {
			throw new IllegalStateException("Empty stack");
		} else {
			return array[0];
		}
	}

	public void push(Object elements) {
		Object[] push = new Object[size + 1];
		for (int i = 0; i < array.length; i++) {
			push[i + 1] = array[i];
		}
		push[0] = elements;
		array = push;
		size++;
	}

	public Object pop() {
		if (size == 0) {
			throw new IllegalStateException("Empty stack");
		} else {
			Object p = array[0];
			for (int i = 0; i < size - 1; i++) {
				array[i] = array[i + 1];
			}
			size--;
			return p;
		}
	}

	public Iterator<Object> iterator() {
		return new StackIterator(array, size);
	}
}
