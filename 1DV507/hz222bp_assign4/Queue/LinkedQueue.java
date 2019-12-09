package hz222bp_assign4.Queue;

import java.util.Iterator;
import java.util.NoSuchElementException;

/*Assignment 4; Exercise 1
 *Hailing Zhang(hz222bp) 
 *2018-08-03*/
public class LinkedQueue<T> implements Queue<T> {
	// This implementation is similar with Exercise 1 in the assignment 2
	public LinkedQueue() {

	}
	private int size;
	private Node head;
	private Node tail;

	@Override
	public int size() {

		return size;
	}

	@Override
	public String toString() {
		Node temp = head;
		StringBuilder str = new StringBuilder();
		str.append("[ ");
		while (temp != null) {
			str.append(temp.value + " ");

			temp = temp.next;
		}

		str.append("]");
		return str.toString();
	}

	@Override
	public boolean isEmpty() {

		if (size == 0) {
			return true;
		}
		return false;
	}

	@Override
	public void enqueue(T t) {
		if (head == null) {
			head = new Node(t);
			tail = head;
		} else {
			tail.next = new Node(t);
			tail = tail.next;
		}
		size++;
	}

	@Override
	public T dequeue() {

		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		Node temp = head;
		head = head.next;
		size--;
		return temp.value;
	}

	@Override
	public T first() {

		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		return head.value;
	}

	@Override
	public T last() {

		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		return tail.value;
	}

	private class Node {
		private T value;
		private Node next;

		public Node(T value) {
			this.value = value;
		}
	}

	@Override
	public Iterator<T> iterator() {
		return new LinkedListIterator();
	}

	private class LinkedListIterator implements Iterator<T> {
		private Node node = head;

		public T next() {
			if (!hasNext())
				throw new NoSuchElementException();
			T val = node.value;
			node = node.next;
			return val;
		}

		public boolean hasNext() {
			return node != null;
		}

		public void remove() {
			throw new RuntimeException("remove() is not implemented");
		}
	}
}