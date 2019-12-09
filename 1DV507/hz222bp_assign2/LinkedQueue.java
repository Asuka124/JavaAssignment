package hz222bp_assign2;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * <h1>LinkedIntList</h1> An implementation of the interface queue using
 * head-tail approach. It supports the usual <em>enqueue</em> and
 * <em>dequeue</em> operations, and also contains basic support for sequential
 * access of the whole content (i.e., iterators).
 * <p>
 * Illegal accesses (Empty queue) should throw an exception of type
 * <code>NoSuchElementExceptio</code>.
 * <p>
 * Assignment 2; Exercise 1; Task 1
 * 
 * @author Hailing Zhang(hz222bp)
 * @version 1.0
 * @since 2018-02-01
 */
public class LinkedQueue implements Queue {
	/**
	 * @param <code>head</code>
	 *            is the first element, <code>tail</code> is the last element.
	 *
	 */
	private int size = 0;
	private Node head = null;
	private Node tail = null;

	/**
	 * Node in the list.
	 *
	 */
	private class Node {
		Object value;
		Node next = null;

		Node(Object element) {
			this.value = element;
		}

	}

	/**
	 * Number of integers currently stored in the list.
	 * <p>
	 * 
	 * @return {@code true} if this queue is empty; {@code false} otherwise.
	 *
	 */
	@Override
	public int size() {
		return size;
	}

	/**
	 * Checks if the list is empty.
	 * <p>
	 * 
	 * @return <code>true</code> if the list is empty.
	 *
	 */
	@Override
	public boolean isEmpty() {
		if (size == 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Adds this reference object to list with which it is registered.
	 * 
	 * @param element
	 *            that is the generic type of an item in this queue.
	 */
	@Override
	public void enqueue(Object element) {
		if (isEmpty()) {
			head = new Node(element);
			tail = head;
		} else {
			tail.next = new Node(element);
			tail = tail.next;
		}
		size++;
	}

	/**
	 * Removing the head of the list, then return the new one.
	 * <p>
	 * 
	 * @return the first element after removing the old one.
	 * @throws NoSuchElementException
	 *             if the <code>size</code> is 0.
	 */
	@Override
	public Object dequeue() {
		if (isEmpty()) {
			throw new NoSuchElementException("The queue is empty");
		}
		Node temp = head;
		System.out.println("The first element \"" + head.value + "\" is removed.");
		head = head.next;
		size--;

		return temp.value;
	}

	/**
	 * Check the first element without any change.
	 * <p>
	 * 
	 * @return the first object in the list
	 * @throws NoSuchElementException
	 *             if the <code>size</code> is 0.
	 */
	@Override
	public Object first() {
		if (isEmpty()) {
			throw new NoSuchElementException("The queue is empty");
		}
		return head.value;
	}

	/**
	 * Check the last element without any change.
	 * <p>
	 * 
	 * @return the last object in the list
	 * @throws NoSuchElementException
	 *             if the <code>size</code> is 0.
	 */
	@Override
	public Object last() {
		if (isEmpty()) {
			throw new NoSuchElementException("The queue is empty");
		}
		return tail.value;
	}

	/**
	 * Iterator for this list.
	 * <p>
	 * 
	 * @throws NoSuchElementException
	 *             if the <code>size</code> is 0.
	 * 
	 */
	@Override
	public Iterator<Object> iterator() {
		System.out.println("Iterator: ");
		return new LinkedIntListIterator();
	}

	/**
	 * 
	 * Element iterator. Iterates through all elements of queue that in FIFO order.
	 */
	public class LinkedIntListIterator implements Iterator<Object> {
		private Node nd = head;

		/**
		 * @return true if the iteration has more elements.
		 */
		@Override
		public boolean hasNext() {
			if (nd != null) {
				return true;
			} else {
				return false;
			}
		}

		/**
		 * @return the next elements.
		 */
		@Override
		public Object next() {
			if (isEmpty()) {
				throw new NoSuchElementException("The queue is empty");
			}
			Object element = nd.value;
			nd = nd.next;
			return element;
		}

		/**
		 * Remove from the underlying collection the last element returned by this
		 * iterator.
		 */
		@Override
		public void remove() {
			throw new RuntimeException("remove() is not implemented");
		}
	}

	/**
	 * Returns a string representation of the current list content. For example, a
	 * string of like "[ 7, 60, -9, 110 ... ]".
	 * 
	 * @return string representation of the content.
	 */
	public String toString() {
		String str = "";
		Node nd = head;
		str += "[ ";
		while (nd != null) {
			str += (nd.value).toString() + " ";
			nd = nd.next;
		}
		return str += "]";
	}
}