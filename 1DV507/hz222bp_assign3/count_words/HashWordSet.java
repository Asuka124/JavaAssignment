package hz222bp_assign3.count_words;

import java.util.Iterator;
import java.util.NoSuchElementException;

/*Assignment 3; Exercise 6
 *Hailing Zhang(hz222bp) 
 *2018-02-25*/
public class HashWordSet implements WordSet {
	private int size;
	private Node[] bucket = new Node[8];

	public HashWordSet() {
		size = 0;
	}

	private class Node {
		Word word;
		Node next;

		public Node(Word w) {
			word = w;
		}
	}

	private int getBucketNumber(Word w) {
		int hc = w.hashCode();
		if (hc < 0) {
			hc = Math.abs(hc);
		}
		return hc % bucket.length;
	}

	private void rehash() {
		Node[] temp = bucket;
		bucket = new Node[2 * temp.length];
		size = 0;
		for (Node n : temp) {
			if (n == null)
				continue;// empty bucket
			while (n != null) {
				add(n.word);
				n = n.next;
			}
		}

	}

	@Override
	public Iterator iterator() {
		return new HashIterator();
	}

	private class HashIterator implements Iterator<Word> {
		Node node = null;
		int count = 0;

		@Override
		public boolean hasNext() {
			for (int i = count; i < bucket.length; i++) {
				if (bucket[i] != null) {
					return true;
				}
			}
			return false;
		}

		@Override
		public Word next() {
			if (node != null && node.next != null) {
				node = node.next;
			} else {
				do {
					if (count == bucket.length) {
						throw new NoSuchElementException();
					}
					node = bucket[count++];
				} while (node != null);
			}
			return node.word;
		}

	}

	@Override
	public void add(Word word) {
		if (contains(word)) {
			return;// already found
		} else {
			int pos = getBucketNumber(word);
			Node node = bucket[pos];// first node

			while (node != null) {// iterate the list
				node = node.next;
			}

			node = new Node(word);// add new
			node.next = bucket[pos];
			bucket[pos] = node;
			size++;

			if (size == bucket.length)
				rehash();
		}
	}

	@Override
	public boolean contains(Word word) {
		int pos = getBucketNumber(word);//if the word were found return true
		Node node = bucket[pos];
		while (node != null) {
			if (node.word.equals(word))
				return true;
			else
				node = node.next;
		}
		return false; 
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("[ ");
		for (int i = 0; i < bucket.length; i++) {
			Node node = bucket[i];
			while (node != null) {
				str.append(node.word + ", ");
				node = node.next;
			}
		}
		str.append(" ]");
		return str.toString();
	}
}
