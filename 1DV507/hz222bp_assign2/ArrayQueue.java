package hz222bp_assign2;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * <h1>ArrayQueue</h1>
 * 
 * This is another implementation of the interface Queue
 * <p>
 * Assignment 2; Exercise 2 (VG Task)
 * 
 * @author Hailing Zhang(hz222bp)
 * @version 1.0
 * @since 2018-02-05
 */
public class ArrayQueue implements Queue {
	public static void main(String[] args) {
		ArrayQueue aq = new ArrayQueue();
		aq.enqueue(2);
		aq.enqueue(1);
		aq.enqueue(3);
		aq.enqueue(0);
		aq.enqueue(-1);
		aq.enqueue(6);
		aq.enqueue(7);
		aq.enqueue(4);
		aq.enqueue(10);

		System.out.println(aq.toString());
		System.out.println("Is the list empty? " + aq.isEmpty());// check if the list is empty
		System.out.println("The list has " + aq.size() + " objects.");// the size of list
		System.out.println("The first element \"" + aq.first() + "\" is removed.");// first element
		System.out.println("The last element in the list: " + aq.last());// last element

		System.out.println(aq.dequeue() + " is removed");// return and remove first element.
		System.out.println("The first element in the list: " + aq.first());// first element

		Iterator<Object> Iterator = aq.iterator();
		System.out.println("Iterator: ");
		while (Iterator.hasNext()) {
			System.out.print(Iterator.next().toString() + " ");
		}

	}

	private Object[] aq;
	private int first;
	private int last;
	private int size;

	public ArrayQueue() {
		aq = new Object[8]; // would resize later
		first = 0;
		last = 0;
		size = 0;
	}

	@Override
	public int size() {
		return size;
	}

	private void resize() {
		Object[] tmp = new Object[2 * aq.length];
		for (int count = 0; count < size; count++) {
			tmp[count] = aq[first];
			first = (first + 1) % aq.length;
		}
		first = 0;
		last = size;// save the space (insert at and increase position last)
		aq = tmp;
	}

	@Override
	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		return false;
	}

	@Override
	public void enqueue(Object element) {
		if (size == aq.length) {
			resize();
		}
		aq[last] = element;
		last = (last + 1) % aq.length;
		size++;
	}

	@Override
	public Object dequeue() {
		if (isEmpty()) {
			throw new NoSuchElementException("Queue is empty");
		}
		Object output = aq[first];
		aq[first] = null;
		first = (first + 1) % aq.length; // return and increase position first
		size--;
		return output;
	}

	@Override
	public Object first() {
		if (isEmpty()) {
			throw new NoSuchElementException("Queue is empty");
		} else {
			return aq[first];
		}
	}

	@Override
	public Object last() {
		if (isEmpty()) {
			throw new NoSuchElementException("Queue is empty");
		} else {
			return aq[last - 1];
		}
	}

	@Override
	public Iterator<Object> iterator() {
		return new ArrayQueueIterator();
	}

	public class ArrayQueueIterator implements Iterator<Object> {
		int count = first;
		private Object now = aq[count];

		@Override
		public boolean hasNext() {
			if (now != null) {
				return true;
			} else {
				return false;
			}
		}

		@Override
		public Object next() {
			if (isEmpty()) {
				throw new NoSuchElementException("The queue is empty");
			}
			Object element = now;
			now = aq[count + 1];
			count = count + 1 % size();
			return element;
		}

		@Override
		public void remove() {
			throw new RuntimeException("remove() is not implemented");
		}
	}

	@Override
	public String toString() {
		String str = "[ ";
		for (int i = 0; i < aq.length; i++) {
			if (aq[i] != null) {
				str += aq[i].toString() + " ";
			}
		}
		return str + "]";
	}
}